package fhtw.chatroom_frontend.cells;

import fhtw.chatroom_frontend.chat.PrivateChat;
import fhtw.chatroom_frontend.controller.PrivateChatItemController;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ListCell;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class PrivateChatItemCell extends ListCell<PrivateChat> {
    private final Pane chatView;
    private PrivateChatItemController chatController;

    public PrivateChatItemCell() {
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("components/private-chat-item.fxml"));
            chatView = loader.load();
            chatController = loader.getController();
            setGraphic(chatView);
            setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
