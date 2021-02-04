package behavioral.chain;

public class PayAplication {
    public static void main(String[] args) throws Exception {
        var p1 = new SberCard(1000);
        var p2 = new TinkoffCard(10000);
        var p3 = new PayPal(100000);

        Transferer handler = p1;
        p1.setSuccessor(p2);
        p2.setSuccessor(p3);

        p1.transfer(15000);
    }
}
