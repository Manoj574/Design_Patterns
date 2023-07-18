package Bridge;

public class Car extends Vehicle{
    public Car(Workshop produceWorkshop, Workshop assembleWorkshop){
        super(produceWorkshop, assembleWorkshop);
    }
    @Override
    public void manufacture() {
        System.out.print("Car");
        produceWorkshop.work();
        assembleWorkshop.work();
    }
}
