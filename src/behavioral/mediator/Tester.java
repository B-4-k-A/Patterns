package behavioral.mediator;

public class Tester extends Participant{
    public Tester(Mediator _mediator) {
        super(_mediator);
    }

    @Override
    public void receive(String msg) {
        System.out.println("Message for tester : " + msg);
    }
}
