package behavioral.observer;

import java.util.HashMap;

public abstract class Bank {
    HashMap<String, Double> payLoad;

    public abstract void notification(String moneyName, double value);
}
