package behavioral.chain;

public class SberCard extends Transferer {
    public SberCard(double money) {
        super(money);
    }

    @Override
    void selfTransfer(double money) {
        System.out.println("Transferred " + money + " by SberCard");
    }
}
