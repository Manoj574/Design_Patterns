package Mediator;

public class Client {

    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();

        User john = new User("John", mediator);
        User patrick = new User("Patrick", mediator);
        User gerald = new User("Gerald", mediator);
        User tom = new User("Tom", mediator);

        mediator.addUser(john);
        mediator.addUser(patrick);
        mediator.addUser(gerald);
        mediator.addUser(tom);

        john.sendMessage("HI ALL!!");
        System.out.println("*************");
        patrick.sendMessage("HI John..");

    }
}
