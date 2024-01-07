package fhtw.chatroom_frontend.message;

import java.time.LocalDateTime;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
public abstract class Message {
    private final LocalDateTime time;

    public Message() {
        this.time = LocalDateTime.now();
    }
}
