package behavioral.observer;

public class Main {
    public static void main(String[] args) {
        var bank1 = new ConcreteBank();
        var bank2 = new ConcreteBank();
        var stock = new Stock();
        stock.register(bank1);
//        stock.register(bank2);

        stock.market();
    }
}
