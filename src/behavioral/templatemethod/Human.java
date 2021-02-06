package behavioral.templatemethod;

public class Human extends Unit{
    @Override
    protected void collectResource() {
        System.out.println("Collection resource");
    }

    @Override
    protected void building() {
        System.out.println("Building wall");
    }

    @Override
    protected void attack() {
        System.out.println("Punch enemies");
    }
}
