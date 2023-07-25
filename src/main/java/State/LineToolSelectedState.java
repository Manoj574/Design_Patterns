package State;

public class LineToolSelectedState implements SelectedState{
    @Override
    public void mouseClick() {
        System.out.println("Starting to draw Line on Canvas");
    }

    @Override
    public void mouseRelease() {
        System.out.println("Drawn a line");
    }
}
