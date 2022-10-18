// Задание 3 - Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида
// 1 Расширение файла: txt
// 2 Расширение файла: pdf
// 3 Расширение файла:
// 4 Расширение файла: jpg

import java.io.File;
import java.util.IOException;

public class Task3 {

    public static void main(String[] args) throws IOException {
        try {
            String pathProject = System.getProperty("user.dir");
            // File dir = new File("C://Users//User//VSCodeProjects//Java//Homework//Homework2//Task3");
            // File[] arrFiles = dir.listFiles();
            // List<File> lst = Arrays.asList(arrFiles);
            
            System.out.println(files);
        } finally {
            System.out.println("Тут могла бы быть Ваша реклама");
        }

    }

}