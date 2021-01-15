package structural.adapter;

public class AdapterJavaAppToDatebase extends JavaAplication implements Database{
    @Override
    public void insert() {
       saveOblect();
    }

    @Override
    public void update() {
        updateOblect();
    }

    @Override
    public void select() {
        loadOblect();
    }

    @Override
    public void remove() {
        deleteOblect();
    }
}
