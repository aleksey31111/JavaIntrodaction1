package Part_1_IntroductionInJava.Task_5_Example_Input_Compare_Calc;

import java.util.Scanner;

public class ReadFirstCalculatorNumber {
    static Scanner scanner = new Scanner(System.in);
    static double number1;
    public static double readFirstCalculatorNumber(double number1) {
        System.out.print("Введите Первое Число Для Калькулятора: ");
        number1 = scanner.nextDouble();
        return number1;
    }
}
