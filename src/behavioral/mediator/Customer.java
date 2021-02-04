package behavioral.mediator;

public class Customer extends Participant{
    public Customer(Mediator _mediator) {
        super(_mediator);
    }

    @Override
    public void receive(String msg) {
        System.out.println("Message for customer : " + msg);
    }
}
