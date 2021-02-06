package behavioral.templatemethod;

public class Monster extends Unit{
    @Override
    protected void collectResource() {

    }

    @Override
    protected void building() {

    }

    @Override
    protected boolean hasEnemy() {
        return true;
    }

    @Override
    protected void attack() {
        System.out.println("Bit enemies");
    }
}
