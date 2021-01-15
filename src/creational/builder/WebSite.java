package creational.builder;

public class WebSite {
    private String name;
    private Cms cms;
    private int Price;

    public void setName(String name) {
        this.name = name;
    }

    public void setCms(Cms cms) {
        this.cms = cms;
    }

    public void setPrice(int price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "WebSite{" +
                "name='" + name + '\'' +
                ", cms=" + cms +
                ", Price=" + Price +
                '}';
    }
}
