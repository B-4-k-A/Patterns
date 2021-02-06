package behavioral.templatemethod;

import java.util.Random;

public abstract class Unit {

    public void turn() {
        collectResource();
        building();
        if(hasEnemy()) {
            attack();
        }
    }

    protected abstract void collectResource();

    protected abstract void building();

    protected  boolean hasEnemy()  {
       return new Random().nextDouble() > 0.6;
    }

    protected abstract void attack();
}
