package structural.bridge;

public class BankingSystem extends Program{
    public BankingSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("BankingSystem development in progress...");
        developer.writeCode();
    }
}
