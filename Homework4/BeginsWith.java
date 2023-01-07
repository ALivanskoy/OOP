public class BeginsWith implements IsGood<String> {

    String stringToRemember;

    BeginsWith(String stringToRemember) {
        this.stringToRemember = stringToRemember;
    }

    @Override
    public boolean IsGood(String item) {

        return item.startsWith(this.stringToRemember);
    }
}