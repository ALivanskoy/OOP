// Задание 3 - Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида
// 1 Расширение файла: txt
// 2 Расширение файла: pdf
// 3 Расширение файла:
// 4 Расширение файла: jpg

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
// import java.util.Collectio;

public class Task3 {

    public static void main(String[] args) throws Exception {
        try {
            String pathProject = "C://Users//User//VSCodeProjects//Java//Homework//Homework2//Task3";
            List<File> fileList = getFileList(pathProject);
            System.out.println(fileList);
            // System.out.println(getExtension(fileList));
        } finally {
            System.out.println("Тут могла бы быть Ваша реклама");
        }
    }

    private static List<File> getFileList(String pathProject) throws IOException {
        try {
            File dir = new File(pathProject);
            File[] arrFiles = dir.listFiles();

            List<File> fileList = Arrays.asList(arrFiles);
            return fileList;

        } finally {
            // return null;
        }
    }

    // private static List<String> getExtension(List<File> fileList) {

    //     List<String> extension = fileList;

    //     for (int i = 0; i < fileList.size(); i++) {
    //         extension.add(fileList.get(i).list());
    //     }
    //     return extension;
    }

}