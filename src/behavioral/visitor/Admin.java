package behavioral.visitor;

public class Admin implements Visitable{
    private String role = "Admin";

    public String getRole() {
        return role;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
