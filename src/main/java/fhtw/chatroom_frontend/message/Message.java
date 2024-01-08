package fhtw.chatroom_frontend.message;

import java.time.LocalDateTime;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
public abstract class Message {
    protected final String data;
    protected final LocalDateTime time;
    protected boolean fromMe;


    public Message(String data, boolean fromMe) {
        this.fromMe = fromMe;
        this.time = LocalDateTime.now();
        this.data = data;
    }
}
