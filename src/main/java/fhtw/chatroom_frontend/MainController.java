package fhtw.chatroom_frontend;

import fhtw.chatroom_frontend.cells.ChatListCell;
import fhtw.chatroom_frontend.cells.MessageListCell;
import fhtw.chatroom_frontend.chat.PrivateChat;
import fhtw.chatroom_frontend.message.PrivateChatMessage;
import fhtw.chatroom_frontend.services.CommunicationService;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;

import static fhtw.chatroom_frontend.MainApplication.profile;

public class MainController {
    @FXML
    public TextField messageField;

    @FXML
    public TextField friendField;

    @FXML
    public ListView<PrivateChat> privateChatList = new ListView<>();

    @FXML
    public ListView<PrivateChatMessage> privateChatMessageList = new ListView<>();

    @FXML
    public Label activeChatLabel;

    public PrivateChat activeChat;


    @FXML
    public void initialize() {
        setCustomCells();
        privateChatList.setItems(profile.getPrivateChats());
        privateChatList.getSelectionModel().selectFirst();
        activeChat =  privateChatList.getSelectionModel().getSelectedItem();

        //System.out.println(privateChatList.getSelectionModel().getSelectedIndex());
    }

    @FXML
    public void settings() {
        System.out.println("settings");
    }

    public void setCustomCells() {
        privateChatList.setCellFactory(new ChatListCell());
        privateChatMessageList.setCellFactory(new MessageListCell());
    }

    @FXML
    public void clickChatList() {
        System.out.println("list clicked");
        try{
            activeChatLabel.setText(privateChatList.getSelectionModel().getSelectedItem().getMember().toString());
            activeChat = privateChatList.getSelectionModel().getSelectedItem();
            privateChatMessageList.setItems(activeChat.getMessages());
        } catch (Exception e) {
            System.out.println("list is empty");
        }

    }

    @FXML
    public void sendMessage() throws IOException {
        if(messageField.getText().isEmpty()) {
            return ;
        }
        CommunicationService.sendMessage(activeChat, messageField.getText());
        System.out.println(messageField.getText());
        //activeChat.addMessage(new PrivateChatMessage(messageField.getText(), true));
        messageField.clear();
    }

    @FXML
    public void addFriend() throws IOException, ClassNotFoundException {
        CommunicationService.initData();
      /*  Alert infoAlert = new Alert(Alert.AlertType.INFORMATION);
        String friend = friendField.getText();
        friendField.clear();
        if(CommunicationService.addFriend(friend)) {
            infoAlert.setContentText("added friend");
        } else {
            infoAlert.setContentText("friend not found");
        }
        // Show the alert
        infoAlert.show();*/
    }

}