package visitor;

public class Fruit implements Item{

    String name;
    int pricePerKg;
    int weight;

    public Fruit(int pricePerKg, int weight, String name) {
        this.pricePerKg = pricePerKg;
        this.weight = weight;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getPricePerKg() {
        return this.pricePerKg;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}