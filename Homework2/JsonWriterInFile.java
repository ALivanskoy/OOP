import com.github.cliftonlabs.json_simple.JsonObject;

public class JsonWriterInFile implements WriterInFile {
    
    private JsonObject jsonObj;

    JsonWriterInFile(JsonObject jsonObj) {
        this.jsonObj = jsonObj;
    }

    @Override
    public void write() {
        
        System.out.println("Запись в файл JSON");

    }
}
