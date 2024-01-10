package fhtw.chatroom_frontend.services;


public class CommunicationService {

    public static void sendMessage() {
        System.out.println("Send data to Server...");
    }

    public static void addFriend() {
        System.out.println("looking for a friend in the server...");
    }

    public static boolean login(String username, String password) {
        System.out.println("login...");
        System.out.println("username: " + username);
        System.out.println("password" + password);
        return true;
    }
    public static boolean register(String username, String password) {
        System.out.println("register...");
        System.out.println("username: " + username);
        System.out.println("password" + password);
        return true;
    }
}
