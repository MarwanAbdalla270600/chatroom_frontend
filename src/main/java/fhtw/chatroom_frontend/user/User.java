package fhtw.chatroom_frontend.user;

import fhtw.chatroom_frontend.chat.GroupChat;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Set;

@Getter
@EqualsAndHashCode
public class User implements Serializable {
    protected String username;
    protected String password;
    protected char gender;


    public User(String username, char gender) {
        this.username = username;
        this.gender = gender;
        this.password = "Passw123";
    }

    @Override
    public String toString() {
        return  username;
    }
}
