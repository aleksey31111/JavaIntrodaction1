package Part_1_IntroductionInJava.lecture_4_createMethod;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
//        Lecture_4_createMethod.Sum.sum();
//        System.out.println(FirstReadingData.first + SecondReadingData.second);
//        Sum.sum();
//        first + second
        Scanner input = new Scanner(System.in);
        int first;
        int second;
        System.out.print("Введите первое Число: ");
        first = input.nextInt();
        System.out.print("Введите второе Число: ");
        second = input.nextInt();
//        int resultSum = sum(first, second);
        System.out.println("Сумма : " + sum(first, second));
    }
    public static int sum(int firstNumber, int secondNumber) {
//        int result = 0;
//        result = firstNumber + secondNumber;
        return firstNumber + secondNumber;
    }
}
