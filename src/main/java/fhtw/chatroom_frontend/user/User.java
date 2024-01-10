package fhtw.chatroom_frontend.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import fhtw.chatroom_frontend.chat.GroupChat;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import com.fasterxml.jackson.databind.ObjectMapper;

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

    }

    public User(String username, String password, char gender) {
        this.username = username;
        this.password = password;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return  username;
    }

    public String toJson() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(this);
    }

}
