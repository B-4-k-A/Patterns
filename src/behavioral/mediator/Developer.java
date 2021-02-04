package behavioral.mediator;

public class Developer extends Participant{
    public Developer(Mediator _mediator) {
        super(_mediator);
    }

    @Override
    public void receive(String msg) {
        System.out.println("Message for developer : " + msg);
    }
}
