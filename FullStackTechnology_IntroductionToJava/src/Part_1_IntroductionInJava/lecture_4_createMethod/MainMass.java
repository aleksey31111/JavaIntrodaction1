package Part_1_IntroductionInJava.lecture_4_createMethod;

import java.util.Scanner;

public class MainMass {
    public static void main(String[] args) {

        // Создание Массива Вариант 1.
//        int[] mass = new int[10];
//        for (int i = 0; i < mass.length; i++) {
//            System.out.println("Вариант 1: " + i);
//        }

        // Создание Массива Вариант 2:
        //int[] mass = new int[]{45, 53, 64, 65, 76};
//        for (int i = 0; i < mass.length; i++) {
        //    System.out.print("Вариант 2: Элемент 1= " + mass[0]);
        //    System.out.print(" Вариант 2: Элемент 2= " + mass[1]);
        //    System.out.print(" Вариант 2: Элемент 3= " + mass[2]);
        //    System.out.print(" Вариант 2: Элемент 4= " + mass[3]);
        //    System.out.println(" Вариант 2: Элемент 5= " + mass[4]);
//        }

        // Создание Массива Вариант 3 C Помощъю Цикда.
        Scanner input = new Scanner(System.in);
        int[] mass = new int[5];
        // Автоматическое Заполнение Массива по Индексу От 0 До 4,
        // И значениями От 0 + 1 До 4 + 1
//        for (int i = 0; i < 5; i++) {
//            int newElement = i + 1;
//            mass[i] = newElement;
//            System.out.println("Вариант 3 : Значение индекса: " + i +
//                    " Значение Элемента: " + newElement);
//        }
//        System.out.println(mass[0]);
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите Элеметн Массива по Индексу " + i);
            mass[i] = input.nextInt();
        }
        printMass(mass);
    }
    // Вариант 3 Использование Цикла "for" для Вывода Массива
//    public static void printMass(int[] massive) {
//        for (int i = 0; i < massive.length; i++) {
//            System.out.println("Вариант 3 Значение Инвекса: " + i +
//                    ", Значение Элнемента Массива: " + massive[i]);
//        }
//    }
    // Вариант 3. Использование Цикла "forEach" для Вывода Массива:
    public static void printMass(int[] mass) {
        for (int element : mass) {
            System.out.print("Элемент " + ": " + element + "; ");
        }
    }
}
