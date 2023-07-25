package visitor;

public interface Item {

    int accept(ShoppingCartVisitor visitor);
}
