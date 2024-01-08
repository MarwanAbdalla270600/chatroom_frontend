package fhtw.chatroom_frontend.message;

import fhtw.chatroom_frontend.chat.GroupChat;
import fhtw.chatroom_frontend.user.User;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString

public class GroupChatMessage extends Message {
    private User sender;
    private GroupChat receiver;

    public GroupChatMessage(String data, boolean fromMe, User sender, GroupChat receiver) {
        super(data, fromMe);
        this.sender = sender;
        this.receiver = receiver;
    }

}