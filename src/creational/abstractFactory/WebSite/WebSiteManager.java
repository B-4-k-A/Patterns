package creational.abstractFactory.WebSite;

import creational.abstractFactory.ProjectManager;

public class WebSiteManager implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("WebSiteProject manages project...");
    }
}
