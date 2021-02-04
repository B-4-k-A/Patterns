package behavioral.mediator;

public interface Mediator {
    void send(String msg, Participant participant);
}
