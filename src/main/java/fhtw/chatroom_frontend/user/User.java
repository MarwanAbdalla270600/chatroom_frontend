package fhtw.chatroom_frontend.user;

import fhtw.chatroom_frontend.chat.GroupChat;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.Set;

@Getter
@EqualsAndHashCode
@ToString
public class User {
    protected String username;


    public User(String username) {
        this.username = username;
    }
}
