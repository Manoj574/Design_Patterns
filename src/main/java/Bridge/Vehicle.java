package Bridge;

public abstract class Vehicle {
    Workshop produceWorkshop;
    Workshop assembleWorkshop;

    public Vehicle(Workshop produceWorkshop, Workshop assembleWorkshop){
        this.produceWorkshop = produceWorkshop;
        this.assembleWorkshop = assembleWorkshop;
    }
    public abstract void manufacture();
}
