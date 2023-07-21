package Mediator;

public class User {
     ChatMediator mediator;
     String name;
     public User(String name, ChatMediator mediator){
         this.name = name;
         this.mediator = mediator;
     }

     public void sendMessage(String msg){
         System.out.println(this.name+" - Sending Message.. - "+msg);
         mediator.notifyUsers(msg, this);
     }
     public void receiveMessage(String msg){
         System.out.println(this.name+" - Received Message : "+msg);

     }


}
