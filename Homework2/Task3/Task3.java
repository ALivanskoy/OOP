// Задание 3 - Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида
// 1 Расширение файла: txt
// 2 Расширение файла: pdf
// 3 Расширение файла:
// 4 Расширение файла: jpg

//Мне кажется, я очень сильно перемудрил, но более изящное решение не придумал
//Первая проблема заключалась в том, что я так и не понял как взять путь к папке проекта автоматически
//Вторая проблема заключалась в том, что нет понимания как напрямую ковыряться в массиве строк, без
// преобразования их в StringBuilder

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;


public class Task3 {

    public static void main(String[] args) throws IOException {
        try {
            // Сюда нужно вписать путь к проверяемой папке:
            String pathProject = "C://Users//User//VSCodeProjects//Java//Homework//Homework2//Task3";
            // Получаем лист типов данных "File"
            List<File> fileList = getFileList(pathProject);
            // Переводим лист типов данных "File" в массив строк
            String[] fileArray = getStringArrayFromList(fileList);
            // Переводим массив строк в массив StrindBuilder,
            // затем из него получаем массив расширений файлов
            String[] extensionArray = getExtensionArray(arrayStringToArrayStringBuilder(fileArray));
            // Печатаем результат
            System.out.print("\nСписок расширений файлов в папке ''" + pathProject + "'' :\n");
            printStringArray(extensionArray);

        } finally {
            System.out.println("\nТут могла бы быть Ваша реклама\n");
        }
    }

    private static void printStringArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static List<File> getFileList(String pathProject) throws IOException {
        try {
            File dir = new File(pathProject);
            File[] arrFiles = dir.listFiles();

            List<File> fileList = Arrays.asList(arrFiles);
            return fileList;

        } finally {
        }
    }

    private static String[] getStringArrayFromList(List<File> fileList) {

        String[] array = new String[fileList.size()];

        for (int i = 0; i < fileList.size(); i++) {
            array[i] = fileList.get(i).toString();
        }
        return array;
    }

    private static StringBuilder[] arrayStringToArrayStringBuilder(String[] array) {

        StringBuilder[] sbArray = new StringBuilder[array.length];
        for (int i = 0; i < array.length; i++) {
            sbArray[i] = new StringBuilder(array[i].subSequence(0, array[i].length()));
        }

        return sbArray;

    }

    private static String[] getExtensionArray(StringBuilder[] array) {

        String[] strArray = new String[array.length];

        for (int i = 0; i < array.length; i++) {

            strArray[i] = array[i].subSequence(array[i].indexOf(".") + 1, array[i].length()).toString();
        }

        return strArray;

    }

}