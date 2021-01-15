package structural.composite;

public class Project {
    public static void main(String[] args) {
        Developer firstJavaDev = new JavaDeveloper();
        Developer secondJavaDev = new JavaDeveloper();

        ProjectTeam designDevelopers = new ProjectTeam();
        designDevelopers.addDeveloper(firstJavaDev);
        designDevelopers.addDeveloper(secondJavaDev);

        Developer firstCppDev = new CppDeveloper();
        Developer secondCppDev = new CppDeveloper();
        Developer thirdCppDev = new CppDeveloper();

        ProjectTeam backendDevelopers = new ProjectTeam();
        backendDevelopers.addDeveloper(firstCppDev);
        backendDevelopers.addDeveloper(secondCppDev);
        backendDevelopers.addDeveloper(thirdCppDev);

        ProjectTeam webSiteCreatorCompany = new ProjectTeam();
        webSiteCreatorCompany.addDeveloper(designDevelopers);
        webSiteCreatorCompany.addDeveloper(backendDevelopers);

        webSiteCreatorCompany.createProject();

        webSiteCreatorCompany.removeDeveloper(thirdCppDev);
        System.out.println("delete " + thirdCppDev);

        webSiteCreatorCompany.createProject();

    }
}
