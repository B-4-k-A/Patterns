package creational.Prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "SuperProject", "SourceCode sourCode = new SourceCode();");

        System.out.println(master);
//        Project masterClone = (Project) master.copy();
        ProjectFactory projectFactory = new ProjectFactory(master);
        Project masterClone = projectFactory.cloneProject();

        System.out.println("\n===========================\n");
        System.out.println(masterClone);
    }
}
