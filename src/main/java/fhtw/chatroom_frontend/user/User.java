package fhtw.chatroom_frontend.user;

import fhtw.chatroom_frontend.chat.GroupChat;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.Set;

@Getter
@EqualsAndHashCode
public class User {
    protected String username;

    protected char gender;


    public User(String username, char gender) {
        this.username = username;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return  username;
    }
}
