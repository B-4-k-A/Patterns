package behavioral.visitor;

public class User implements Visitable{
    private String role = "User";

    public String getRole() {
        return role;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
