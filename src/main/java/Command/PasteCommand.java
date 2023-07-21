package Command;

public class PasteCommand extends Command{

    public PasteCommand(Editor editor){
        super(editor);
    }
    @Override
    void execute() {
        if(editor.getClipboardText() != null){
            String temp = editor.getClipboardText();
            editor.setSelectedText(temp);
        }
    }
}
