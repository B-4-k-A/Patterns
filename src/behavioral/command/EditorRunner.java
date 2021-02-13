package behavioral.command;

import java.util.Stack;

public class EditorRunner {
    public static void main(String[] args) {
        var editor = new Editor();
        editor.setText("Hello, World!");
        var cmd = new CutCommand(editor);
        Stack<Command> cmdStack = new Stack<>();
        cmd.execute();
        System.out.println(editor.getText());
        cmdStack.push(cmd);
        /* -- -------
        -------------
        -------------
        any command
         */
        cmdStack.pop().undo();
        System.out.println(editor.getText());
    }
}
