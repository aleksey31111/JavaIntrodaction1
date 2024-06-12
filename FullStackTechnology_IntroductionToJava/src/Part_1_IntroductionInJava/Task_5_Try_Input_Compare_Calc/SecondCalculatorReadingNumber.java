package Part_1_IntroductionInJava.Task_5_Try_Input_Compare_Calc;

import java.util.Scanner;

public class SecondCalculatorReadingNumber {
    static Scanner inputSecondCalculatorNumber = new Scanner(System.in);
    static int secondCalculatorNumber;
    static int secondCalculatorReadingNumber(int secondCalculatorNumber) {
        System.out.print("Введите Второе Число для Калькулятора: ");
        secondCalculatorNumber = inputSecondCalculatorNumber.nextInt();
//        System.out.println("Вторая Цифра Калькулятора: " + secondCalculatorNumber);
        return secondCalculatorNumber;
    }
}
