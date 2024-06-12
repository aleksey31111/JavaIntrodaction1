package Part_1_IntroductionInJava.Task_5_Try_Input_Compare_Calc;

import java.util.Scanner;

public class FirstCalculatorReadingNumber {
    static Scanner inputFirstCalculatorNumber = new Scanner(System.in);
    static int firstCalculatorNumber;
    public static int firstCalculatorReadingNumber(int firstCalculatorNumber) {
        System.out.println("Введите Первое Число Для Калькулятопа: ");
        firstCalculatorNumber =inputFirstCalculatorNumber.nextInt();
//        System.out.println("Первая Цифра Калькулятора: " + firstCalculatorNumber);
        return firstCalculatorNumber;
    }
}
