package creational.builder;

public abstract class WebSiteBuilder {
    private WebSite website;

    public WebSiteBuilder() {
        createWebSite();
    }

    public void createWebSite() {
        website = new WebSite();
    }

    public abstract void buildName();
    public abstract void buildCms();
    public abstract void buildPrice();

    public WebSite getWebSite() {
        return website;
    }
}
