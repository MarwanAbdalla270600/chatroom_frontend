package fhtw.chatroom_frontend;

import cells.ChatListCell;
import fhtw.chatroom_frontend.chat.PrivateChat;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import static fhtw.chatroom_frontend.HelloApplication.marwan;

public class HelloController {
    @FXML
    public ListView<PrivateChat> privateChatList = new ListView<>();


    @FXML
    public void initialize() {
        setCostumCells();
        ObservableList<PrivateChat> list= FXCollections.observableArrayList(marwan.getPrivateChats());
        System.out.println(list);
        privateChatList.setItems(list);
    }
    @FXML
    public void settings() {
        System.out.println("settings");
    }

    public  void setCostumCells() {
        privateChatList.setCellFactory(new ChatListCell());
    }

}