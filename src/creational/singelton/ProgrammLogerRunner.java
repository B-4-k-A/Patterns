package creational.singelton;

public class ProgrammLogerRunner {
    public static void main(String[] args) {
//        System.out.println(ProgrammLoger.getProgrammLoger().toString());
//        System.out.println(ProgrammLoger.getProgrammLoger().toString());
//        System.out.println(ProgrammLoger.getProgrammLoger().toString());
//        System.out.println(ProgrammLoger.getProgrammLoger().toString());

        ProgrammLoger.getProgrammLoger().addLogInfo("First log.");
        ProgrammLoger.getProgrammLoger().addLogInfo("Second log.");
        ProgrammLoger.getProgrammLoger().addLogInfo("Thirds log.");

        ProgrammLoger.getProgrammLoger().showLogInfo();
    }
}
