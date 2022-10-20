// Задание 1 - Дана строка json файл
// Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

//Сделал немного кустарно, но пока не допёр как перебирать все параметры в Json по порядку
import java.io.FileReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;;

public class App {
    public static void main(String[] args) throws Exception {

        String path = "C://Users//User//VSCodeProjects//Java//Homework//Homework2//Task1//ivanov.json";
        printStudentParam(path);
    }

    private static void printStudentParam(String pathToJson) throws Exception {

        // Считываем json
        Object studentObject = new JSONParser().parse(new FileReader(pathToJson));
        // Кастим obj в JSONObject
        JSONObject studJsonObject = (JSONObject) studentObject;
        // Достаём firstName and lastName
        StringBuilder studentSb = new StringBuilder();

        // формируем массив строк с необходимой информацией
        studentSb.append("Студент ");
        if (studJsonObject.get("фамилия") != null)
            studentSb.append((String) studJsonObject.get("фамилия"));
        else {
            System.out.println("Искомая строка невалидна");
            return;
        }
        studentSb.append(" получил ");
        if (studJsonObject.get("оценка") != null)
            studentSb.append((String) studJsonObject.get("оценка"));
        else {
            System.out.println("Искомая строка невалидна");
            return;
        }
        studentSb.append(" по предмету ");
        if (studJsonObject.get("предмет") != null)
            studentSb.append((String) studJsonObject.get("предмет"));
        else {
            System.out.println("Искомая строка невалидна");
            return;
        }
        System.out.println(studentSb.toString());
    }

}
