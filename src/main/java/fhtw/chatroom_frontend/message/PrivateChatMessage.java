package fhtw.chatroom_frontend.message;


import fhtw.chatroom_frontend.user.User;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class PrivateChatMessage extends Message {
    public PrivateChatMessage(String data, boolean fromMe) {
        super(data, fromMe);
    }
}