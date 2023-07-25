package Memento;

public class Client {

    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State 1");
        careTaker.addMemento(originator.save());

        originator.setState("State 2");
        careTaker.addMemento(originator.save());

        originator.setState("State 3");
        careTaker.addMemento(originator.save());

        originator.restore(careTaker.getMemento(0));
        System.out.println(originator.getState());

        originator.restore(careTaker.undo());
        System.out.println(originator.getState());

        originator.restore(careTaker.undo());
        System.out.println(originator.getState());


    }
}
