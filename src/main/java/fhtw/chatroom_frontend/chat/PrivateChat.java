package fhtw.chatroom_frontend.chat;

import fhtw.chatroom_frontend.message.PrivateChatMessage;
import fhtw.chatroom_frontend.user.User;
import lombok.EqualsAndHashCode;
import lombok.ToString;


import java.util.LinkedList;
import java.util.List;

@ToString
@EqualsAndHashCode(callSuper = true)
public class PrivateChat extends Chat {
    private final User member;
    private List<PrivateChatMessage> messages;

    public PrivateChat(User member) {
        super();
        this.member = member;
        this.messages = new LinkedList<>();
    }
}