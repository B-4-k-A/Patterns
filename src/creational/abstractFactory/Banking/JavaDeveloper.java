package creational.abstractFactory.Banking;

import creational.abstractFactory.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("JavaDeveloper writes code...");
    }
}
