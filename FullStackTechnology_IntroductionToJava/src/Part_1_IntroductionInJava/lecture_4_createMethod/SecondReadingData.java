package Part_1_IntroductionInJava.lecture_4_createMethod;

import java.util.Scanner;

public class SecondReadingData {
    static Scanner inputSecondNumber = new Scanner(System.in);
    static int second;
    public static int secondReadingData(int second) {
        System.out.print("Введите Второе Число: ");
        second = inputSecondNumber.nextInt();
        return second;
    }

}
