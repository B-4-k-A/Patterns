package structural.adapter;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterJavaAppToDatebase();

        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}
