package Part_1_IntroductionInJava.Task_5_Try_Input_Compare_Calc;

import java.util.Scanner;

public class ReadNumberFromTheConsole {
    static Scanner inputFromLine = new Scanner(System.in);
    static int input1Number;
    public static int read1NumberFromConsole(int input1Number) {
        System.out.print("Введите Первое Число для Длинны Массива: ");
        input1Number = inputFromLine.nextInt();
        System.out.println("Введённое Число = " + input1Number);
        return input1Number;
    }
}
