package creational.factory;

public class ObjectCreator {
    public static void main(String[] args) {
        DeveloperFactory devFactory = new JavaDeveloperFactory();
        Developer developer = devFactory.createDeveloper();
        developer.writeCode();
    }
}
