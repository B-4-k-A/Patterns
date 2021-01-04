package creational.abstractFactory.WebSite;

import creational.abstractFactory.Developer;

public class PHPDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHPDeveloper writes code...");
    }
}
