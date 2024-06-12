package Part_1_IntroductionInJava.Task_5_Example_Input_Compare_Calc;

import java.util.Scanner;

public class ReadSecondCalculatorNumber {
    static Scanner scanner = new Scanner(System.in);
    static double number2;
    public static double readSecondCalculatorNumber(double number2) {
        System.out.print("Введите Второе Число Для Калькулятора: ");
        number2 = scanner.nextDouble();
        return number2;
    }
}
