package creational.Prototype;

public class Project implements CopyAble{
    private int id;
    private String projectName;
    private String code;

    public Project(int id, String projectName, String code) {
        this.id = id;
        this.projectName = projectName;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public Object copy() {
        Project copy = new Project(id, projectName, code);
        return copy;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
