package behavioral.chain;

public class TinkoffCard extends Transferer {
    public TinkoffCard(double money) {
        super(money);
    }

    @Override
    void selfTransfer(double money) {
        System.out.println("Transferred " + money + " by TinkoffCard");
    }
}
