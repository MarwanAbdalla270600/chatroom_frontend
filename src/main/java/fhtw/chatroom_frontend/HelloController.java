package fhtw.chatroom_frontend;

import fhtw.chatroom_frontend.cells.ChatListCell;
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
    public Label activeChatLabel;

    public PrivateChat activeChat;

    @FXML
    public void initialize() {
        setCostumCells();
        privateChatList.setItems(marwan.getPrivateChats());
        //System.out.println(privateChatList.getSelectionModel().getSelectedIndex());
    }
    @FXML
    public void settings() {
        System.out.println("settings");
    }

    public  void setCostumCells() {
        privateChatList.setCellFactory(new ChatListCell());
    }

    @FXML
    public void clickChatList() {
        System.out.println("list clicked");
        activeChatLabel.setText(privateChatList.getSelectionModel().getSelectedItem().getMember().toString());
        activeChat = privateChatList.getSelectionModel().getSelectedItem();
    }

}