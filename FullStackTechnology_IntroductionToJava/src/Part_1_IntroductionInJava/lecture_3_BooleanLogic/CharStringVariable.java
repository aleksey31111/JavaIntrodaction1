package Part_1_IntroductionInJava.lecture_3_BooleanLogic;

import java.util.Scanner;

public class CharStringVariable {
    static Scanner inputFromLine = new Scanner(System.in);
    char c = 'h';
//    String inputFirstNumber = "Введите Первое Число: ";
    static int firstNumber;
    static int secondNumber;
    static String enterFirstNumber = "Введите Первое Число: ";

    static String enterSecondNumber = "Введите Второе Число: ";
    static String firstIsBigger = "Первое Число Больше: ";
    static String secondIsBigger = "Второе Число Больше: ";
    static String numbersAreEquals = "Числа Равны: ";
    static void compareNumber() {

        System.out.println(enterFirstNumber);
        firstNumber = inputFromLine.nextInt();
        System.out.println(enterSecondNumber);
        secondNumber = inputFromLine.nextInt();
        if (firstNumber > secondNumber) {
            System.out.println(firstIsBigger);
        } else if (secondNumber > firstNumber) {
            System.out.println(secondIsBigger);
        }else {
            System.out.println(numbersAreEquals);
        }
    }
}
