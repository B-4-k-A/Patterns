package behavioral.chain;

public class PayPal extends Transferer{
    public PayPal(double money) {
        super(money);
    }

    @Override
    void selfTransfer(double money) {
        System.out.println("Transferred " + money + " by PayPal");
    }
}
