package IntroToThreads;

public class Client {

    public static void main(String[] args) {

        EvenNumberPrinter even = new EvenNumberPrinter();
        OddNumberPrinter odd = new OddNumberPrinter();

        Thread t1 = new Thread(even);
        Thread t2 = new Thread(odd);

        t1.start();
        t2.start();

    }
}
