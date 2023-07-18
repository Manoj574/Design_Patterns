package Observer;

public class Client {

    public static void main(String[] args) {
        Observer obs1 = new AmazonObserver("Alpha");
        Observer obs2 = new AmazonObserver("Beta");
        Observer obs3 = new AmazonObserver("Gamma");

        Publisher publisher = new Publisher();

        publisher.registerObserver(obs1);
        publisher.registerObserver(obs2);
        publisher.registerObserver(obs3);

        publisher.unregisterObserver(obs2);

        publisher.postMessage("Your Order is Available now");
    }
}
