package fhtw.chatroom_frontend;

import fhtw.chatroom_frontend.chat.PrivateChat;
import fhtw.chatroom_frontend.message.PrivateChatMessage;
import fhtw.chatroom_frontend.user.Profile;
import fhtw.chatroom_frontend.user.User;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class MainApplication extends Application {
    public static Socket socket;

    static {
        try {
            socket = new Socket("localhost", 12345);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Profile profile = new Profile("marwan", 'm', "1234");


    @Override
    public void start(Stage stage) {
        initialize();
        Platform.runLater(() -> {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("onboarding.fxml")); //here you can change the fxml to load
                Scene scene = new Scene(fxmlLoader.load(), 1006, 720);
                stage.setTitle("Chat MVP!    " + profile.getUsername());
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                System.err.println("Error loading FXML file: " + e.getMessage());
            }
        });
    }

    public static void initialize() {
        User thomas = new User("thomas", 'm');
        User manuel = new User("manuel", 'm');
        User merkel = new User("merkel", 'f');
        User anna = new User("anna", 'f');
        User frank = new User("frank", 'm');
        User max = new User("maxine", 'f');
        User moritz = new User("moritz", 'm');
        User niko = new User("niko", 'm');
        User favour = new User("nikolette", 'f');

        PrivateChat a = new PrivateChat(thomas);
        PrivateChat b = new PrivateChat(manuel);
        PrivateChat c = new PrivateChat(merkel);
        PrivateChat d = new PrivateChat(anna);
        PrivateChat e = new PrivateChat(frank);
        PrivateChat f = new PrivateChat(max);
        PrivateChat g = new PrivateChat(moritz);
        PrivateChat h = new PrivateChat(niko);
        PrivateChat i = new PrivateChat(favour);

        a.addMessage(new PrivateChatMessage("hallo", false ));
        a.addMessage(new PrivateChatMessage("wie", false ));
        a.addMessage(new PrivateChatMessage("geht", false ));
        a.addMessage(new PrivateChatMessage("es", false ));


        profile.addPrivateChat(a);
        profile.addPrivateChat(b);
        profile.addPrivateChat(c);
        profile.addPrivateChat(d);
        profile.addPrivateChat(e);
        profile.addPrivateChat(f);
        profile.addPrivateChat(g);
        profile.addPrivateChat(h);
        profile.addPrivateChat(i);

    }

    public static void main(String[] args) throws IOException {

        launch();

    }
}