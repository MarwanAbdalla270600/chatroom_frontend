package fhtw.chatroom_frontend.services;


import com.fasterxml.jackson.core.JsonProcessingException;
import fhtw.chatroom_frontend.MainApplication;
import fhtw.chatroom_frontend.user.Profile;
import fhtw.chatroom_frontend.user.User;
import org.controlsfx.control.tableview2.filter.filtereditor.SouthFilter;

import java.io.*;

public class CommunicationService {

    public static void sendMessage() {
        System.out.println("Send data to Server...");
    }

    public static void addFriend() {
        System.out.println("looking for a friend in the server...");
    }

    public static boolean login(String username, String password) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(MainApplication.socket.getInputStream()));
        User test = new User(username, password, 'm');
        ObjectOutputStream out = new ObjectOutputStream(MainApplication.socket.getOutputStream());
        String json = test.toJson();
        json = json + "l";
        out.writeObject(json);
        out.close();
        in.close();

        return true;
    }
    public static boolean register(String username, String password) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(MainApplication.socket.getInputStream()));
        User test = new User(username, password, 'm');
        ObjectOutputStream out = new ObjectOutputStream(MainApplication.socket.getOutputStream());
        String json = test.toJson();
        json = json + "r";
        out.writeObject(json);
        String respone = in.readLine();
        in.close();
        out.close();
        return respone.equals("true");
    }
}
