package fhtw.chatroom_frontend;

import fhtw.chatroom_frontend.services.CommunicationService;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.io.IOException;

public class OnboardingController {
    @FXML
    public TextField username;

    @FXML
    public TextField password;



    @FXML
    public void login() throws IOException {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        if(CommunicationService.login(username.getText(), password.getText())) {
            alert.setContentText("login successfull");
        } else {
            alert.setContentText("login failed");
        }
        alert.show();    }
    @FXML
    public void register() throws IOException {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        if(CommunicationService.register(username.getText(), password.getText())) {
            alert.setContentText("Registrer successfull");
        } else {
            alert.setContentText("Register failed");
        }
        alert.show();
    }

}
