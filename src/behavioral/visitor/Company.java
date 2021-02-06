package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Visitable> _participants = new ArrayList<>();

    public void add(Visitable v) {
        _participants.add(v);
    }

    public void remove(Visitable v) {
        _participants.remove(v);
    }

    public void accept(Visitor v) {
        _participants.stream().forEach(participant -> participant.accept(v));
    }

    public String buildReport(Visitor v) {
        var html = new HtmlVisitor();
        accept(html);
        return html.report();
    }
}
