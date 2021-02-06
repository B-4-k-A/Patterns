package behavioral.state;

public class Phone {
    private State _state;

    public Phone(State state) {
        setState(state);
    }

    public void setState(State state) {
        _state = state;
    }

    public void pressUp() {
        _state.pressUp();
    }

    public void pressDown() {
        _state.pressDown();
    }

    public void pressBlock() {
        _state.pressBlock();
    }
}
