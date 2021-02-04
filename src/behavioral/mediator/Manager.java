package behavioral.mediator;

public class Manager implements Mediator{
    private Customer customer;
    private Developer developer;
    private Tester tester;


    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    public void setTester(Tester tester) {
        this.tester = tester;
    }

    @Override
    public void send(String msg, Participant participant) {
        if(participant == customer) {
            developer.receive(msg);
        }
        else if (participant == developer) {
            tester.receive(msg);
        }
        else if (participant == tester) {
            customer.receive(msg);
        }

    }
}
