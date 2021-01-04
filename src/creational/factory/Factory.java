package creational.factory;

public class Factory {
    public static void main(String[] args) {
        DeveloperFactory devFactory = new JavaDeveloperFactory();
        Developer developer = devFactory.createDeveloper();
        developer.writeCode();
    }
}
