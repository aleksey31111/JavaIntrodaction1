package Lesson38Exception_Part2_TrowingException;

import java.io.IOException;
import java.util.Scanner;

public class Exceptions2 {
//    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        while(true) {
//            int x = Integer.parseInt(scanner.nextLine());
//
//            if (x != 0) {
//                throw new IOException();
//            }
//        }
//    }

    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int x = Integer.parseInt(scanner.nextLine());

            if(x != 0){
//                try{  // Исключение через Блщк try catch
//                    throw new IOException();
//                } catch (IOException e){
//                    System.out.println("Пользователь Ввел Что-то Кроме Нуля");
//                }

                throw new ScannerException("Пользователь Ввёл Что-то Кроме Нуля.");
            }
        }
    }
}
