package behavioral.mediator;

public abstract class Participant {
    protected Mediator _mediator;

    public Participant(Mediator _mediator) {
        this._mediator = _mediator;
    }

    public void send(String msg) {
        _mediator.send(msg, this);
    }

    public abstract void receive(String msg);

}
