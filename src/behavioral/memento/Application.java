package behavioral.memento;

import java.util.Stack;

public class Application {
    public static void main(String[] args) {
        var hero = new Hero();
        var heroMemStack = new Stack<>();

        hero.shoot();
        hero.shoot();

        heroMemStack.push(hero.save());

        hero.shoot();
        hero.shoot();
        System.out.println("Bullets before restore");
        System.out.println(hero.getBullets());

        hero.restore(heroMemStack.pop());

        System.out.println("Bullets after restore");
        System.out.println(hero.getBullets());

    }
}
