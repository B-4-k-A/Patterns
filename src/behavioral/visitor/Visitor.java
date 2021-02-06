package behavioral.visitor;

public interface Visitor {
    void visit(Admin admin);
    void visit(Staff staff);
    void visit(User user);
}
