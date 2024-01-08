package fhtw.chatroom_frontend.chat;

import fhtw.chatroom_frontend.message.Message;
import fhtw.chatroom_frontend.message.PrivateChatMessage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.util.List;
import java.util.LinkedList;

@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public abstract class Chat {

    protected LocalDateTime date;
    protected ObservableList<PrivateChatMessage> messages = FXCollections.observableArrayList();


    public Chat() {
        this.date = LocalDateTime.now();
    }
}