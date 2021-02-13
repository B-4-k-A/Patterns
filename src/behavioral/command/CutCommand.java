package behavioral.command;

public class CutCommand extends BaseCommand{
    protected String backup;

    public CutCommand(Editor editor) {
        super(editor);
    }

    @Override
    public void execute() {
        backup = editor.getText();
        editor.setText("");
    }

    @Override
    public void undo() {
        editor.setText(backup);
    }
}
