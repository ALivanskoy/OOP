public class FaceID implements Unlock<String> {
    
    private String faceId;



    public FaceID(String faceId) {
        this.faceId = faceId;
    }



    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }



    @Override
    public boolean checkUnlock(String faceId) {
        return this.faceId == faceId;
    }
}
