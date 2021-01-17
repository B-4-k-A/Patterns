package structural.facade;

public class BugTracker {
    private boolean bugTracker;

    public boolean isActiveSprint() {
        return bugTracker;
    }

    public void startSprint() {
        System.out.println("Sprint is active");
        bugTracker = true;
    }

    public void finishSprint() {
        System.out.println("Sprint stopped");
        bugTracker = false;
    }
}
