package structural.composite;

import java.util.ArrayList;

public class ProjectTeam extends Developer{
    ArrayList<Developer> developers = new ArrayList<>();

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void removeDeveloper(Developer developer) {
        for(Developer dev : developers) {
            if(dev.isComposite()) {
                ProjectTeam devTeam = (ProjectTeam)dev;
                devTeam.removeDeveloper(developer);
            }
        }
        developers.remove(developer);
    }

    public void createProject() {
        System.out.println("Team creates project...");
        writeCode();
    }

    @Override
    protected void writeCode() {
        for(Developer developer : developers) {
            developer.writeCode();
        }
    }

    @Override
    public boolean isComposite() {
        return true;
    }
}
