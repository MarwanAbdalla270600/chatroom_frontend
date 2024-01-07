package fhtw.chatroom_frontend.user;

import fhtw.chatroom_frontend.chat.GroupChat;
import fhtw.chatroom_frontend.chat.PrivateChat;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
public class Profile extends User {

    private String password;
    private Set<User> friendList;
    //private Set<PrivateChat> privateChats;
    private ObservableList<PrivateChat> privateChats = FXCollections.observableArrayList();

    private Set<GroupChat> groupChats;

    private List<FriendRequest> friendRequests = new ArrayList<>();

    public Profile(String username, String password) {
        super(username);
        this.password = password;
        this.friendList = new HashSet<>();
        this.groupChats = new HashSet<>();
        this.friendRequests = new ArrayList<>();
    }

    public void addPrivateChat(PrivateChat chat) {
        privateChats.add(chat);
    }

}
