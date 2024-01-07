package fhtw.chatroom_frontend.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FriendRequest {
    private User sender;

    public FriendRequest(User sender) {
        this.sender = sender;
    }
}
