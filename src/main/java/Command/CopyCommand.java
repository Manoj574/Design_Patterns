package Command;

public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    void execute() {
        if (editor.getSelectedText() != null) {
            String temp = editor.selectedText;
            editor.setClipboardText(temp);
        }
    }
}