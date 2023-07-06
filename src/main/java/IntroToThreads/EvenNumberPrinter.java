package IntroToThreads;

public class EvenNumberPrinter implements Runnable{
    public void run(){
        for(int i = 0;i < 1000;i=i+2){
            System.out.println(i);
        }
    }
}
