package fhtw.chatroom_frontend.services;


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
        PrintWriter out = new PrintWriter(MainApplication.socket.getOutputStream(), true);

        /*OutputStream outputStream = MainApplication.socket.getOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
*/

        BufferedReader in = new BufferedReader(new InputStreamReader(MainApplication.socket.getInputStream()));
        User test = new User(username, 'm');
       // objectOutputStream.writeObject(test);

        out.println("This is username and pw: " + test);

        System.out.println(in.readLine());

        return true;
    }
    public static boolean register(String username, String password) {
        System.out.println("register...");
        System.out.println("username: " + username);
        System.out.println("password" + password);
        return true;
    }
}
