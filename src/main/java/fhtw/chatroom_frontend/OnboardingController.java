package fhtw.chatroom_frontend;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class OnboardingController {
    @FXML
    public TextField username;

    @FXML
    public TextField password;



    @FXML
    public void login() {
        System.out.println("login...");
        System.out.println(username.getText());
        System.out.println(password.getText());
    }
    @FXML
    public void register() {
        System.out.println("register...");
        System.out.println(username.getText());
        System.out.println(password.getText());
    }

}
