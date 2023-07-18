package Bridge;

public class ProduceWorkshop implements Workshop{
    @Override
    public void work() {
        System.out.print(" is Produced ");
    }
}
