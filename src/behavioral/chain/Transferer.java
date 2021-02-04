package behavioral.chain;

public abstract class Transferer {
    private Transferer successor;

    protected double money;

    public Transferer(double money) {
        this.money = money;
    }

    public Transferer getSuccessor() {
        return successor;
    }

    public void setSuccessor(Transferer successor) {
        this.successor = successor;
    }

    public void transfer(double money) throws Exception {
        if(this.money < money) {
            if(this.successor != null) {
                successor.transfer(money);
            } else {
                throw new Exception("Not have enough money");
            }
        } else {
            selfTransfer(money);
        }
    }

    abstract void selfTransfer(double money);
}
