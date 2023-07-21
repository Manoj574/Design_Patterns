package Mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator{
    List<User> list;


    @Override
    public void notifyUsers(String msg, User sender) {
        for (User user : list) {
            if(user != sender) {
                user.receiveMessage(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
        if(list == null){
            list = new ArrayList<>();
        }
        list.add(user);
    }
}
