package fhtw.chatroom_frontend.services;


import com.fasterxml.jackson.core.JsonProcessingException;
import fhtw.chatroom_frontend.MainApplication;
import fhtw.chatroom_frontend.chat.ChatMessage;
import fhtw.chatroom_frontend.chat.PrivateChat;
import fhtw.chatroom_frontend.user.Profile;
import fhtw.chatroom_frontend.user.User;
import org.controlsfx.control.tableview2.filter.filtereditor.SouthFilter;

import java.io.*;

public class CommunicationService {

    public static void initData() throws IOException, ClassNotFoundException {
        //BufferedReader in = new BufferedReader(new InputStreamReader(MainApplication.socket.getInputStream()));
        //ObjectInputStream inObject = new ObjectInputStream(MainApplication.socket.getInputStream());
        ObjectOutputStream out = new ObjectOutputStream(MainApplication.socket.getOutputStream());
        out.writeObject(MainApplication.profile.getUsername() + "i");
        ObjectInputStream inObject = new ObjectInputStream(MainApplication.socket.getInputStream());

        String response = (String)inObject.readObject();
        System.out.println(response);
        //out.close();
        //inObject.close();
    }

    public static void sendMessage(PrivateChat chat, String messageText) throws IOException {
        System.out.println("Send data to Server...");
        ObjectOutputStream outObject = new ObjectOutputStream(MainApplication.socket.getOutputStream());
        BufferedReader inReader = new BufferedReader(new InputStreamReader(MainApplication.socket.getInputStream()));

        /*outObject.writeObject(MainApplication.profile.getUsername() + ";" + chat.getChatId() + ";" + messageText + 's');
        outObject.close();*/
        ChatMessage chatMessage = new ChatMessage(MainApplication.profile.getUsername(), chat.getChatId(), messageText);
        outObject.writeObject(chatMessage.toJson() + "s");


        /*String response = inReader.readLine();
        inReader.close();
        System.out.println(response);
        return response.equals("true");*/
    }

    public static boolean addFriend(String username) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(MainApplication.socket.getInputStream()));
        ObjectOutputStream out = new ObjectOutputStream(MainApplication.socket.getOutputStream());
        out.writeObject(MainApplication.profile.getUsername() + ";" + username + 'f');
        out.close();
        String response = in.readLine();
        in.close();
        System.out.println(response);
        return response.equals("true");
    }

    public static boolean login(String username, String password) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(MainApplication.socket.getInputStream()));
        User test = new User(username, password, 'm');
        ObjectOutputStream out = new ObjectOutputStream(MainApplication.socket.getOutputStream());
        String json = test.toJson();
        json = json + "l";
        out.writeObject(json);
        String response = in.readLine();
        out.close();
        in.close();
        return response.equals("true");
    }
    public static boolean register(String username, String password) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(MainApplication.socket.getInputStream()));
        User test = new User(username, password, 'm');
        ObjectOutputStream out = new ObjectOutputStream(MainApplication.socket.getOutputStream());
        String json = test.toJson();
        json = json + "r";
        out.writeObject(json);
        String response = in.readLine();
        in.close();
        out.close();
        return response.equals("true");
    }
}
