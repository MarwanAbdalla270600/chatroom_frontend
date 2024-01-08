package fhtw.chatroom_frontend.cells;

import fhtw.chatroom_frontend.chat.PrivateChat;
import fhtw.chatroom_frontend.message.Message;
import fhtw.chatroom_frontend.message.PrivateChatMessage;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.util.Callback;

import java.time.format.DateTimeFormatter;

public class MessageListCell implements Callback<ListView<PrivateChatMessage>, ListCell<PrivateChatMessage>> {
    @FXML
    private Label messageData;
    @FXML
    private Label timestamp;

    public ListCell<PrivateChatMessage> call(ListView<PrivateChatMessage> param) {
        return new ListCell<PrivateChatMessage>() {
            public void updateItem(PrivateChatMessage message, boolean empty) {
                super.updateItem(message, empty);
                if (empty) {
                    setText(null);
                    setGraphic(null);
                } else if (message != null) {
                    setText(null); // Clear text

                    HBox messageContainer = new HBox();
                    if (message.isFromMe()) {
                        messageContainer.setAlignment(Pos.CENTER_RIGHT);
                    }

                    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

                    Text messageText = new Text(message.getData());
                    Text timestampText = new Text(message.getTime().format(myFormatObj));

                    // Style the message bubble based on byMe
                    Pane messageBubble = createMessageBubble(message.isFromMe());
                    messageBubble.setPadding(new Insets(20));

                    // Create a VBox to arrange text and timestamp vertically
                    VBox messageContent = new VBox();
                    messageContent.getChildren().addAll(messageText, timestampText);

                    // Set padding specifically for the right side to avoid overflow
                    messageContent.setPadding(new Insets(0, 20, 0, 0));

                    // Add the VBox to the message bubble
                    messageBubble.getChildren().add(messageContent);

                    // Add the message bubble to the container
                    messageContainer.getChildren().add(messageBubble);

                    setGraphic(messageContainer);
                } else {
                    setText("null");
                    setGraphic(null);
                }
            }

            private Pane createMessageBubble(boolean byMe) {
                Pane messageBubble = new Pane();
                messageBubble.getStyleClass().add("message-bubble");

                // Add style class based on byMe
                if (byMe) {
                    messageBubble.getStyleClass().add("from-me");
                } else {
                    messageBubble.getStyleClass().add("from-others");
                }

                return messageBubble;
            }
        };
    }
}
