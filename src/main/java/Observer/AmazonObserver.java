package Observer;

public class AmazonObserver implements Observer{
    String name;

    public AmazonObserver(String name){
        this.name = name;
    }
    @Override
    public void update(String content) {
        System.out.println(this.name+" is notified with"+" '"+content+"'");
    }
}
