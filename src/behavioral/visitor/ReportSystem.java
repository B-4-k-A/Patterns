package behavioral.visitor;

/* Есть система, в которой присутствует участники с разными ролями.
В системе должен быть механизм выгрузки информации об участниках в разных форматах.
 */

public class ReportSystem {
    public static void main(String[] args) {
        var company = new Company();
        company.add(new Admin());
        company.add(new Staff());
        company.add(new User());

        System.out.println(company.buildReport(new HtmlVisitor()));
    }
}
