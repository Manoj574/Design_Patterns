package visitor;

public class CartBillCountVisitor implements ShoppingCartVisitor{
    @Override
    public int visit(Book book) {
        //apply 5Rs discount if Book price is greater than 50
        int cost = 0;
        if(book.getPrice() > 50){
            cost = book.getPrice() - 5;
        }
        else{
            cost = book.getPrice();
        }
        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg()* fruit.getWeight();
        return cost;
    }
}
