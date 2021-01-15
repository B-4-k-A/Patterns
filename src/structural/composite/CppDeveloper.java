package structural.composite;

public class CppDeveloper extends Developer{
    @Override
    protected void writeCode() {
        System.out.println("CppDeveloper writes C++ code...(" + this + ")");
    }
}
