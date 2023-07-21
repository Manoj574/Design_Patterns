package Command;

public class Editor {

    public String clipboardText;
    public String selectedText;

    public String getSelectedText(){
        return selectedText;
    }

    public String getClipboardText(){
        return clipboardText;
    }

    public void setSelectedText(String text){
        this.selectedText = text;
    }

    public void setClipboardText(String text){
        this.clipboardText = text;
    }

}
