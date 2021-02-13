package behavioral.command;

public abstract class BaseCommand implements Command{
    protected Editor editor;

    public BaseCommand(Editor editor) {
        this.editor = editor;
    }

    @Override
    public abstract void execute();

    @Override
    public abstract void undo();
}
