package structural.composite;

public abstract class Developer {
    protected abstract void writeCode();
    protected boolean isComposite() {
        return false;
    }
}
