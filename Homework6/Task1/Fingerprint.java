public class Fingerprint implements Unlock<String> {

    private String fingerprint;



    public Fingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }



    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }



    @Override
    public boolean checkUnlock(String fingerprint) {
        return this.fingerprint == fingerprint;
    }




    
}
