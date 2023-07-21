package Mediator;

public interface ChatMediator {

    void notifyUsers(String msg, User user);
    void addUser(User user);

}
