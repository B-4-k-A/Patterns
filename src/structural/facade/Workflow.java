package structural.facade;

public class Workflow {
    private Job job = new Job();
    private Developer developer = new Developer();
    private BugTracker bugTracker = new BugTracker();

    public void solveProblem() {
        job.doJob();
        developer.doJobBeforeDeadline(bugTracker);
    }

    public void startSprint() {
        bugTracker.startSprint();
    }

    public void finishSprint() {
        bugTracker.finishSprint();
    }
}

