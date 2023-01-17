public class Pin implements Unlock<Integer> {

    private int pin;

    public Pin(int pin) {
        this.pin = pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public boolean checkUnlock(Integer pin) {
        return this.pin == pin;
    }

}
