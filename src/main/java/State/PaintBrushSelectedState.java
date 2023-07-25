package State;

public class PaintBrushSelectedState implements SelectedState{
    @Override
    public void mouseClick() {
        System.out.println("Starting to paint on Canvas");
    }

    @Override
    public void mouseRelease() {
        System.out.println("Painted the region where cursor travelled");
    }
}
