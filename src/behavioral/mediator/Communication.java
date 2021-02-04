package behavioral.mediator;

public class Communication {
    public static void main(String[] args) {
        var mediator = new Manager();
        var customer = new Customer(mediator);
        var developer = new Developer(mediator);
        var tester = new Tester(mediator);

        mediator.setCustomer(customer);
        mediator.setDeveloper(developer);
        mediator.setTester(tester);

        customer.send("I want this application");
        developer.send("Application can be checked");
        tester.send("Application is good!");
    }
}
