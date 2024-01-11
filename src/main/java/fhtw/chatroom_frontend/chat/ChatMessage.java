package fhtw.chatroom_frontend.chat;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;

public class ChatMessage implements Serializable {
    private int chatId;
    private String senderUsername;
    private String messageText;

    public ChatMessage(String senderUsername, int chatId, String messageText) {
        this.senderUsername = senderUsername;
        this.chatId = chatId;
        this.messageText = messageText;
    }


    public int getChatId() {
        return chatId;
    }

    public String getSenderUsername() {
        return senderUsername;
    }

    public String getMessageText() {
        return messageText;
    }

    @Override
    public String toString() {
        return "ChatMessage{" +
                "chatId=" + chatId +
                ", senderUsername='" + senderUsername + '\'' +
                ", messageText='" + messageText + '\'' +
                '}';
    }

    public String toJson() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(this);
    }
}
