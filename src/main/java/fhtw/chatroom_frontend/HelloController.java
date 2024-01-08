package fhtw.chatroom_frontend;

import fhtw.chatroom_frontend.cells.ChatListCell;
import fhtw.chatroom_frontend.cells.MessageListCell;
import fhtw.chatroom_frontend.chat.PrivateChat;
import fhtw.chatroom_frontend.message.PrivateChatMessage;
import fhtw.chatroom_frontend.services.CommunicationService;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import static fhtw.chatroom_frontend.HelloApplication.profile;

public class HelloController {
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
        setCostumCells();
        privateChatList.setItems(profile.getPrivateChats());
        //System.out.println(privateChatList.getSelectionModel().getSelectedIndex());
    }

    @FXML
    public void settings() {
        System.out.println("settings");
    }

    public void setCostumCells() {
        privateChatList.setCellFactory(new ChatListCell());
        privateChatMessageList.setCellFactory(new MessageListCell());
    }

    @FXML
    public void clickChatList() {
        System.out.println("list clicked");
        activeChatLabel.setText(privateChatList.getSelectionModel().getSelectedItem().getMember().toString());
        activeChat = privateChatList.getSelectionModel().getSelectedItem();
        privateChatMessageList.setItems(activeChat.getMessages());
    }

    @FXML
    public void sendMessage() {
        if(messageField.getText().isEmpty()) {
            return ;
        }
        CommunicationService.sendMessage();
        System.out.println(messageField.getText());
        activeChat.addMessage(new PrivateChatMessage(messageField.getText(), true));
        messageField.clear();
    }

    @FXML
    public void addFriend() {
        System.out.println(friendField.getText());
        friendField.clear();
        CommunicationService.addFriend();
    }

}