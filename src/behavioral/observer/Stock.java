package behavioral.observer;

import java.util.ArrayList;
import java.util.Random;

public class Stock implements Notifier {
    private ArrayList<Bank> subsribers = new ArrayList<>();

    public void register(Bank b) {
        subsribers.add(b);
    }

    public void unRegister(Bank b) {
        subsribers.remove(b);
    }

    public void market() {
        var rnd = new Random();
        double euro = rnd.nextDouble() * 20 + 70;
        double dollar = rnd.nextDouble() * 20 * 60;
        notification("euro", euro);
        notification("dollar", dollar);
    }

    @Override
    public void notification(String moneyName, double value) {
        for (Bank b : subsribers) {
            b.notification(moneyName, value);
        }
    }
}
