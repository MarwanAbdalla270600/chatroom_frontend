package fhtw.chatroom_frontend.controller;

import fhtw.chatroom_frontend.chat.PrivateChat;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PrivateChatItemController {
    @FXML
    private Label nameLabel;

    @FXML
    private Label messageLabel;

    public void setChatMessage(PrivateChat privateChat) {
        nameLabel.setText(privateChat.getMember().toString());
        messageLabel.setText("sample message");
    }
}
