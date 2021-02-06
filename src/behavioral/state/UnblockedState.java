package behavioral.state;

public class UnblockedState extends PhoneState{
    public UnblockedState(Phone phone) {
        super(phone);
    }

    @Override
    public void pressUp() {
        System.out.println("Volume up");
    }

    @Override
    public void pressDown() {
        System.out.println("Volume down");
    }

    @Override
    public void pressBlock() {
        phone_.setState(new BlockedState(phone_));
    }
}
