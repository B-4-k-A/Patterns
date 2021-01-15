package creational.builder;

public class Director {
    WebSiteBuilder builder;

    public void setBuilder(WebSiteBuilder webSiteBuilder) {
        builder = webSiteBuilder;
    }

    public WebSite buildWebSite() {
        builder.buildName();
        builder.buildCms();
        builder.buildPrice();

        WebSite webSite = builder.getWebSite();

        return webSite;
    }
}
