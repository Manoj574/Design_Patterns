package Decorator;

public class BellsDecorator extends ChristmasTreeDecorator {

    public BellsDecorator(ChristmasTree baseTree){
        this.baseChristmasTree = baseTree;
    }
    @Override
    public String makeChristmasTree() {
        return baseChristmasTree.makeChristmasTree() + addBells();
    }

    public String addBells(){
        return " + Bells";
    }
}
