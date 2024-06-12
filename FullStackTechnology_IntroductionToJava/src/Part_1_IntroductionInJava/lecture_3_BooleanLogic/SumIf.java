package Part_1_IntroductionInJava.lecture_3_BooleanLogic;

import java.util.Scanner;

public class SumIf {
    static Scanner inputFromLine = new Scanner(System.in);
    static int firstNumber;
    static int secondNumber;
    static int result;

    static void sumInputVariable() {
        System.out.println("Введите Первое Число: ");
        firstNumber = inputFromLine.nextInt();
        System.out.println("Введите второе число: ");
        secondNumber = inputFromLine.nextInt();
//        result = firstNumber + secondNumber;
//        System.out.println("Сумма: " + result);
//        if (firstNumber > secondNumber) System.out.println("Первое Число Больше Второго.");
//        if (secondNumber > firstNumber) System.out.println("Второе Число Больше");
//        if (firstNumber == secondNumber) System.out.println("Числа Равны");

//        if (firstNumber > secondNumber) System.out.println("Первое Число Больше Второго.");
//        else if (secondNumber > firstNumber) System.out.println("Второе Число Больше");
//        else if (firstNumber == secondNumber) System.out.println("Числа Равны");

        if (firstNumber > secondNumber) System.out.println("Первое Число Больше Второго.");
        else if (secondNumber > firstNumber) System.out.println("Второе Число Больше");
        else System.out.println("Числа Равны");
    }
}
