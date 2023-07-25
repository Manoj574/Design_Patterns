package State;

public class RectangleBoxSelectedState implements SelectedState{
    @Override
    public void mouseClick() {
        System.out.println("Starting to draw Rectangle Box on Canvas");
    }

    @Override
    public void mouseRelease() {
        System.out.println("Drawn Rectangle Box");
    }
}
