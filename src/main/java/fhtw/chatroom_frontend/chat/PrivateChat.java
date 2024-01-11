package fhtw.chatroom_frontend.chat;

import fhtw.chatroom_frontend.message.PrivateChatMessage;
import fhtw.chatroom_frontend.user.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
public class PrivateChat extends Chat {
    private final User member;

    public PrivateChat(User member, int chatId) {
        super(chatId);
        this.member = member;
    }

    public void addMessage(PrivateChatMessage privateChatMessage) {
        messages.add(privateChatMessage);
    }
}