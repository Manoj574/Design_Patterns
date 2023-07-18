package Decorator;

public class Client {
    public static void main(String[] args) {
        ChristmasTree tree = new GiftsDecorator(new BellsDecorator(new LightsDecorator(new simpleChristmasTree())));
        System.out.println(tree.makeChristmasTree());
    }
}
