// Задание 4 - К калькулятору из предыдущего дз добавить логирование.


import java.util.Scanner;
import java.util.logging.Logger;
import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Logger myLogger = Logger.getAnonymousLogger();
        myLogger.info("main init");
        
        System.out.println("Введите математическое выражение вида 'x/y' без пробелов\n (прим.: 24-15)\n");
        String a = input.next();
        System.out.print("\033[H");
        System.out.print(a + " = " + Calc(a));
    }

    public static String Calc(String str) {
        // метод обработки основных математических действий
        Logger myLogger = Logger.getAnonymousLogger();
        myLogger.info("Calc() in process");
        String sym = GetMathAction(str);
        String[] nums = GetNums(str, sym);
        var num = switch (sym) {
            case "\\+":
                yield (Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]));
            case "-":
                yield (Integer.parseInt(nums[0]) - Integer.parseInt(nums[1]));
            case "/":
                yield (Float.parseFloat(nums[0]) / Float.parseFloat(nums[1]));
            case "\\*":
                yield (Integer.parseInt(nums[0]) * Integer.parseInt(nums[1]));
            default:
                yield "error";
        };
        myLogger.info("Calc() done");
        return num.toString();
    }

    private static String GetMathAction(String str) {
        // метод получения математического действия из строки
        Logger myLogger = Logger.getAnonymousLogger();
        myLogger.info("GetMathAction() in process");
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case '+':
                    return "\\+";
                case '-':
                    return "-";
                case '/':
                    return "/";
                case '*':
                    return "\\*";
            }
        }
        myLogger.info("GetMathAction() done");
        return "0";
    }

    private static String[] GetNums(String str, String sym) {
        // метод получения массива чисел из выражения
        Logger myLogger = Logger.getAnonymousLogger();
        myLogger.info("GetNums() in process");
        myLogger.info("GetNums() done");
        return str.split(sym);
    }
}