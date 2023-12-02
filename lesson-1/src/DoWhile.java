import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введи ПЯТЁРКУ (5): ");
        int value;  // = scanner.nextInt();
//        while (value != 5){
//            System.out.print("Вы ввели: " + value + " !  ");
//            System.out.println("Введи ПЯТЁРКУ (5): ");  // Дублирование Кода,
//            value = scanner.nextInt();  // Строки 6, 7.
//        }
//        System.out.println("Вы ввели ПЯТЁРКУ (5): " + value);

        do{
            System.out.print("Введи ПЯТЁРКУ (5): ");
            value = scanner.nextInt();
            System.out.print("Вы ввели: " + value + " !  ");
        }
        while (value != 5);
        System.out.println("Вы ввели ПЯТЁРКУ (5): " + value);
    }
}
