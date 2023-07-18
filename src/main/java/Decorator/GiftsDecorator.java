package Decorator;

public class GiftsDecorator extends ChristmasTreeDecorator{
    public GiftsDecorator(ChristmasTree baseTree){
        this.baseChristmasTree = baseTree;
    }
    @Override
    public String makeChristmasTree() {
        return baseChristmasTree.makeChristmasTree() + addGifts();
    }
    public String addGifts(){
        return " + Gifts";
    }
}
