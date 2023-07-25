package visitor;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Item> shoppingCart = new ArrayList<>();
        ShoppingCartVisitor visitor = new CartBillCountVisitor();
        Item book1 = new Book(200, "Design Patterns by GoF");
        Item book2 = new Book(45, "Weekly Puzzles");
        Item apple = new Fruit(120, 2, "Apples");
        Item mango = new Fruit(50, 1, "Mangoes");
        shoppingCart.add(book1);
        shoppingCart.add(book2);
        shoppingCart.add(apple);
        shoppingCart.add(mango);

        System.out.println("Total cart Price is - " + getTotalCartPrice(shoppingCart, visitor));


    }
    public static int getTotalCartPrice(List<Item> shoppingCart, ShoppingCartVisitor visitor){
        int cost = 0;
        for (Item item : shoppingCart) {
            cost = cost + item.accept(visitor);
        }
        return cost;
    }
}
