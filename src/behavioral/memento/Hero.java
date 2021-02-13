package behavioral.memento;

public class Hero {
    private int bullets = 20;
    private int healthPoint = 10;

    public int getBullets() {
        return bullets;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void shoot() {
        --this.bullets;
    }

    private class HeroMemento {
        final int bullets;
        final int healthPoint;

        private HeroMemento(int bullets, int healthPoint) {
            this.bullets = bullets;
            this.healthPoint = healthPoint;
        }
    }

    public HeroMemento save() {
        return new HeroMemento(this.bullets, this.healthPoint);
    }

    public void restore(Object heroMemento) throws NullPointerException {
        var memento = (HeroMemento) heroMemento;
        if(memento == null) {
            throw new NullPointerException();
        }
        this.bullets = memento.bullets;
        this.healthPoint = memento.healthPoint;
    }
}
