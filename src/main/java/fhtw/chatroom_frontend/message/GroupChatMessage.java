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
    private String data;
    private User sender;
    private GroupChat receiver;

    public GroupChatMessage(int messageId, String data, User sender, GroupChat receiver) {
        this.data = data;
        this.sender = sender;
        this.receiver = receiver;
    }

}