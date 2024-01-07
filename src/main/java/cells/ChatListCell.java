package cells;

import fhtw.chatroom_frontend.chat.PrivateChat;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;


public class ChatListCell implements Callback<ListView<PrivateChat>, ListCell<PrivateChat>> {
    public ListCell<PrivateChat> call(ListView<PrivateChat> param) {
        return new ListCell<PrivateChat>() {
            public void updateItem(PrivateChat privateChat, boolean empty) {
                super.updateItem(privateChat, empty);
                if (empty) {
                    setText(null);
                    setGraphic(null);
                } else if (privateChat != null) {
                    setText(null);
                    setGraphic(new CheckBox(privateChat.getMember() + " "));
                } else {
                    setText("null");
                    setGraphic(null);
                }
            }
        };
    }
}
