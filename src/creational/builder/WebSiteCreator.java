package creational.builder;

public class WebSiteCreator {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder( new EnterpriseWebSite());
        WebSite webSite = director.buildWebSite();
        System.out.println(webSite);
    }
}
