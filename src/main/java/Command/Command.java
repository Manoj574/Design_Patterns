package Command;

public abstract class Command {

    Editor editor;

    public Command(Editor editor){
        this.editor = editor;
    }
    abstract void execute();
}
