package Decorator;

public class LightsDecorator extends ChristmasTreeDecorator {
    public LightsDecorator(ChristmasTree baseTree){
        this.baseChristmasTree = baseTree;
    }
    @Override
    public String makeChristmasTree() {
        return baseChristmasTree.makeChristmasTree() + addLights();
    }
    public String addLights(){
        return " + Lights";
    }
}
