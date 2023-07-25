package State;

public class Client {

    public static void main(String[] args) {

        Canvas canvas = new Canvas();

        canvas.setState(new RectangleBoxSelectedState());
        canvas.mouseClick();
        canvas.mouseRelease();

        canvas.setState(new PaintBrushSelectedState());
        canvas.mouseClick();
        canvas.mouseRelease();
    }
}
