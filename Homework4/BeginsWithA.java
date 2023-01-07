public class BeginsWithA implements IsGood <String> {

    @Override
    public boolean IsGood(String item) {
        
        return item.startsWith("A");
    }


    
}
