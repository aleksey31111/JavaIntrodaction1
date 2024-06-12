package Part_1_IntroductionInJava.Task_5_Example_Input_Compare_Calc;

import java.util.Scanner;

public class ReadOperationCalculator {
    static Scanner scanner = new Scanner(System.in);
    static String operationCalculator;
    static String readOperationCalculator(String operationCalculator) {
        System.out.print("Введите Операцию Для Калькулятора: \n" +
                "+, -12, -21, /12, /21, %12, %21: ");
        operationCalculator = scanner.nextLine();  //  scanner.toString().charAt(0,1,2) //  scanner.next().charAt(0);
        return operationCalculator;
    }
}
