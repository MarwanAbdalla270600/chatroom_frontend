package fhtw.chatroom_frontend.chat;

import fhtw.chatroom_frontend.message.GroupChatMessage;
import fhtw.chatroom_frontend.user.User;
import lombok.EqualsAndHashCode;
import lombok.ToString;


import java.util.LinkedList;
import java.util.List;

@ToString
@EqualsAndHashCode(callSuper = true)
public class GroupChat extends Chat {
    private String groupName;
    private List<User> members;
    private int maxMembers;
    private List<GroupChatMessage> messages;

    public GroupChat(String groupName, List<User> members, int maxMembers) {
        super();
        this.groupName = groupName;
        this.members = members;
        this.maxMembers = maxMembers;
        this.messages = new LinkedList<>();
    }
}