package fhtw.chatroom_frontend;

import fhtw.chatroom_frontend.cells.PrivateChatItemCell;
import fhtw.chatroom_frontend.chat.PrivateChat;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import static fhtw.chatroom_frontend.MainApplication.marwan;

public class MainController {

    private ListView<PrivateChat> privateChatList = new ListView<>();
    @FXML
    public void initialize() {

        System.out.println(marwan.getPrivateChats());
        privateChatList.setCellFactory(lv -> new PrivateChatItemCell());

    }
}