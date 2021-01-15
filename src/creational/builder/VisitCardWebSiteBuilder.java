package creational.builder;

public class VisitCardWebSiteBuilder extends WebSiteBuilder {
    @Override
    public void buildName() {
        getWebSite().setName("VisitCard website...");
    }

    @Override
    public void buildCms() {
        getWebSite().setCms(Cms.WORDPRESS);
    }

    @Override
    public void buildPrice() {
        getWebSite().setPrice(500);
    }
}
