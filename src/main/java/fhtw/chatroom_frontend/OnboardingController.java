package fhtw.chatroom_frontend;

import fhtw.chatroom_frontend.services.CommunicationService;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class OnboardingController {
    @FXML
    public TextField username;

    @FXML
    public TextField password;



    @FXML
    public void login() throws IOException {
        CommunicationService.login(username.getText(), password.getText());
    }
    @FXML
    public void register() {
        CommunicationService.register(username.getText(), password.getText());
    }

}
