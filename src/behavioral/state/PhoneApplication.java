package behavioral.state;

/* Реализация: одни и теже кнопки телефона выполняют разные действия
 * в зависимости от состояния, в котором находится телефон*/

public class PhoneApplication {
    public static void main(String[] args) {
        var state = new BlockedState(null);
        var phone = new Phone(state);
        state.setPhone(phone);

        phone.pressUp();
        phone.pressBlock();
        phone.pressUp();

    }
}
