package structural.facade;

public class SprintRunner {
    public static void main(String[] args) {
//        Job job = new Job();
//        job.doJob();
//        BugTracker bugTracker = new BugTracker();
//        Developer developer = new Developer();
//        bugTracker.startSprint();
//        developer.doJobBeforeDeadline(bugTracker);
//        bugTracker.finishSprint();
//        developer.doJobBeforeDeadline(bugTracker);
//
        Workflow workflow = new Workflow();
        workflow.startSprint();
        workflow.solveProblem();
        workflow.finishSprint();
        workflow.solveProblem();
    }
}
