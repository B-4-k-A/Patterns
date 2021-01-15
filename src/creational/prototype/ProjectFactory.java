package creational.prototype;

public class ProjectFactory {
    private Project project;

    public Project getProject() {
        return project;
    }

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public Project cloneProject() {
        return (Project) project.copy();
    }
}
