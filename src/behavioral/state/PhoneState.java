package behavioral.state;

public abstract class PhoneState implements State {
    protected Phone phone_;

    public PhoneState(Phone phone) {
        setPhone(phone);
    }

    public void setPhone(Phone phone) {
        phone_= phone;
    }
}
