package behavioral.templatemethod;

/* В компьютерной игре каждый юнит выполняет действие  поп заданному алгоритму,
общему для всех. Но у конкретных юнитов шаги алгоритма несколько отличаются
от других юнитов.
 */

public class GameRunner {
    public static void main(String[] args) {
        var human = new Human();
        var monster = new Monster();

        human.turn();
        monster.turn();

    }
}
