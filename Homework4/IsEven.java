public class IsEven implements IsGood<Integer> {

    @Override
    public boolean IsGood(Integer item) {
        return item % 2 == 0;
    }

}
