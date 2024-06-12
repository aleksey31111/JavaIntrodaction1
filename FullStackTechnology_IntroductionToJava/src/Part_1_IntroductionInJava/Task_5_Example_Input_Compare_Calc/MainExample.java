package Part_1_IntroductionInJava.Task_5_Example_Input_Compare_Calc;

import java.util.Random;
import java.util.Scanner;

public class MainExample {
    public static void main(String[] args) {
        Scanner inputFromCommandLine = new Scanner(System.in);
        System.out.print("Введите размер Массива: ");
        int massLength = inputFromCommandLine.nextInt();
//        System.out.println();
        int[] mass = new int[massLength];
        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(30);
        }
        for (int i = 0; i < mass.length; i++) {
            System.out.print(i + ":" + mass[i] + "; ");
        }
        System.out.println();
        System.out.print("Введите Число Для Поиска: ");
        int number = inputFromCommandLine.nextInt();
//        System.out.println();
        for (int element:
             mass) {
            if (element == number) {
                System.out.println(element);
            }
        }
        int max = mass[0];
        for (int element:
             mass) {
            if (element > max) {
                max = element;
            }
        }
        System.out.print("Максимальное Значение: " + max);
    }
}
