package creational.abstractFactory.Banking;

import creational.abstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("BankingPM manges project...");
    }
}
