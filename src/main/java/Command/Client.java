package Command;

public class Client {

    public static void main(String[] args) {
        Editor editor = new Editor();   // This is Receiver

        editor.setSelectedText("This is selected text in editor");  //This is equal to getting selected text from real editor
        Command command1 = new CopyCommand(editor);
        Invoker invoker = new Invoker(command1);
        invoker.executeCommand();
        System.out.println("This is text in Clipboard after COPY command - "+editor.getClipboardText());

        editor.setClipboardText("This is text in Clipboard");
        editor.setSelectedText(null);
        Command command2 = new PasteCommand(editor);
        invoker = new Invoker(command2);
        invoker.executeCommand();
        System.out.println("This is text in Editor after PASTE command - "+editor.getSelectedText());



    }
}
