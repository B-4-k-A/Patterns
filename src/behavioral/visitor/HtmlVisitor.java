package behavioral.visitor;

import java.util.Date;

public class HtmlVisitor implements Visitor{
    private String _date = "\n";

    @Override
    public void visit(Admin admin) {
        _date += "<p>" + admin.getRole() + "</p>" + "\n";
    }

    @Override
    public void visit(Staff staff) {
        _date += "<p>" + staff.getRole() + "</p>" + "\n";
    }

    @Override
    public void visit(User user) {
        _date += "<p>" + user.getRole() + "</p>" + "\n";
    }

    public String report() {
        return _date;
    }
}
