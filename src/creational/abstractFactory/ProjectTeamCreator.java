package creational.abstractFactory;

import creational.abstractFactory.Banking.BankingTeamFactory;
import creational.abstractFactory.WebSite.WebSiteTeamFactory;

public class ProjectTeamCreator {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating project");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();

    }
}
