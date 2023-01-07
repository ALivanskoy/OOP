public class IsPositive implements IsGood<Integer> {

    @Override
    public boolean IsGood(Integer item) {
        return item > 0;
    }

}
