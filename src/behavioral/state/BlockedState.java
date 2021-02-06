package behavioral.state;

public class BlockedState extends PhoneState {
    public BlockedState(Phone phone ) {
        super(phone);
    }

    @Override
    public void pressUp() {
        System.out.println("Unsupported operation");
    }

    @Override
    public void pressDown() {
        System.out.println("Unsupported operation");
    }

    @Override
    public void pressBlock() {
        phone_.setState(new UnblockedState(phone_));
    }
}
