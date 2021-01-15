package creational.singelton;

public class ProgrammLoger {
    private static ProgrammLoger programLoger;
    private static String logInfo = "This is log file.\n";

    private ProgrammLoger() {}

    public static ProgrammLoger getProgrammLoger() {
        if (programLoger == null) {
            programLoger = new ProgrammLoger();
        }

        return programLoger;
    }

    public static void addLogInfo(String newLogInfo) {
       logInfo += newLogInfo + '\n';
    }

    public static void showLogInfo(){
        System.out.println(logInfo);
    }
}
