package Bridge;

public class Client {
    public static void main(String[] args) {
        Vehicle car = new Car(new ProduceWorkshop(), new AssembleWorkshop());
        car.manufacture();

        Vehicle bike = new Bike(new ProduceWorkshop(), new AssembleWorkshop());
        bike.manufacture();
    }
}
