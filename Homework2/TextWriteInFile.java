
public class TextWriteInFile implements WriterInFile {

    private String str;

    TextWriteInFile(String str) {
        this.str = str;
    }

    @Override
    public void write() {
        
        System.out.println("Запись в файл текста");

    }

}
