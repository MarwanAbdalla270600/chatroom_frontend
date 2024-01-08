package fhtw.chatroom_frontend;

import fhtw.chatroom_frontend.chat.PrivateChat;
import fhtw.chatroom_frontend.message.PrivateChatMessage;
import fhtw.chatroom_frontend.user.Profile;
import fhtw.chatroom_frontend.user.User;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    public static Profile profile = new Profile("marwan", "1234");


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1006, 720);
        stage.setTitle("Chat MVP!    " + profile.getUsername());
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        //Profile marwan = new Profile("marwan", "1234");

        User thomas = new User("thomas");
        User manuel = new User("manuel");
        User merkel = new User("merkel");
        User anna = new User("anna");
        User frank = new User("frank");
        User max = new User("max");
        User moritz = new User("moritz");
        User niko = new User("niko");
        User favour = new User("favour");

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


        System.out.println(profile.getPrivateChats());
        launch();
    }
}