package Part_1_IntroductionInJava.lecture_4_createMethod;

import java.util.Scanner;

public class FirstReadingData {
    static Scanner inputFirstNumber = new Scanner(System.in);
    static int first;

    public static int firstReadingData(int first) {
        System.out.print("Введите Первое Число: ");
        first = inputFirstNumber.nextInt();
        System.out.println();
        return first;
    }


}
