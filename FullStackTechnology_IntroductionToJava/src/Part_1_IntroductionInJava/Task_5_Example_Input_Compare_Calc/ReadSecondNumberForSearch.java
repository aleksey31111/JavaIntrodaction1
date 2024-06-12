package Part_1_IntroductionInJava.Task_5_Example_Input_Compare_Calc;

import java.util.Scanner;

public class ReadSecondNumberForSearch {

    static Scanner inputFromCommandLine = new Scanner(System.in);
    static int searchNumber;
    public static int readSecondNumberForSearch(int searchNumber) {
        System.out.print("Введите Второе Число Для Поиска: ");
        searchNumber = inputFromCommandLine.nextInt();
        return searchNumber;
    }

}
