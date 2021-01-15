package creational.builder;

public class EnterpriseWebSite extends WebSiteBuilder{

    @Override
    public void buildName() {
        getWebSite().setName("Enterprise web site...");
    }

    @Override
    public void buildCms() {
        getWebSite().setCms(Cms.ALIFRESCO);
    }

    @Override
    public void buildPrice() {
        getWebSite().setPrice(1000);
    }
}
