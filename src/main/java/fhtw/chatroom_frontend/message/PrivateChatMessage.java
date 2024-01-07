package fhtw.chatroom_frontend.message;


import fhtw.chatroom_frontend.user.User;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class PrivateChatMessage extends Message {
    private String data;
    private User sender;
    private User receiver;

    public PrivateChatMessage(int messageId, String data, User sender, User receiver) {
        this.data = data;
        this.sender = sender;
        this.receiver = receiver;
    }
}