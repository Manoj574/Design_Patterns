package State;

public class Canvas {         // Canvas is the context here

    SelectedState state;

    public void setState(SelectedState state) {
        this.state = state;
    }

    public void mouseClick(){
        state.mouseClick();
    }
    public void mouseRelease(){
        state.mouseRelease();
    }
}
