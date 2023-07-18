package Bridge;

public class Bike extends Vehicle{

    public Bike(Workshop produceWorkshop, Workshop assembleWorkshop){
        super(produceWorkshop, assembleWorkshop);
    }
    @Override
    public void manufacture() {
        System.out.print("Bike");
        produceWorkshop.work();
        assembleWorkshop.work();

    }
}
