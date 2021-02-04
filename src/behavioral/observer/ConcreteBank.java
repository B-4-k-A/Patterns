package behavioral.observer;

public class ConcreteBank extends Bank {
    @Override
    public void notification(String moneyName, double value) {
        System.out.println(this);
        System.out.println("New course:");
        System.out.println(moneyName + ":\t" + value);
    }
}
