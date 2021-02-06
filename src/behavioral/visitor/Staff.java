package behavioral.visitor;

public class Staff implements Visitable{
    private String role = "Staff";

    public String getRole() {
        return role;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
