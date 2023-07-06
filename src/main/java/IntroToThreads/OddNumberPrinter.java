package IntroToThreads;

public class OddNumberPrinter implements Runnable{

    public void run(){
        for(int i = 1;i < 1000;i=i+2){
            System.out.println(i);
        }
    }
}
