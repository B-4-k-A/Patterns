package structural.composite;

public class JavaDeveloper extends Developer{
    @Override
    protected void writeCode() {
        System.out.println("JavaDeveloper writes java code...(" + this + ")");
    }

}
