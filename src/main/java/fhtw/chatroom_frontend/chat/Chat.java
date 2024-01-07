package fhtw.chatroom_frontend.chat;

import fhtw.chatroom_frontend.message.Message;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.util.List;
import java.util.LinkedList;



@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public abstract class Chat {

    private LocalDateTime date;
    private List<Message> messages;

    public Chat() {
        this.date = LocalDateTime.now();
        this.messages = new LinkedList<>();
    }
}