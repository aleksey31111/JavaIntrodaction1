package Part_1_IntroductionInJava.Task_5_Try_Input_Compare_Calc;

import java.util.Scanner;

public class ReadNumberForCompare {
    static Scanner comparesedNumber = new Scanner(System.in);
    static int secondNumber;
    public static int readNumber2ForCompare(int secondNumber) {
        System.out.println("Введите 2 Число для Сравнения: ");
        secondNumber = comparesedNumber.nextInt();
//        int number2 = secondNumber;
//        System.out.println("2 Введённое Число = " + secondNumber);
//        return number2;
        return secondNumber;
    }
}
