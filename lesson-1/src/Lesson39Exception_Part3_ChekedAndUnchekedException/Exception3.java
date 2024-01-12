package Lesson39Exception_Part3_ChekedAndUnchekedException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) {
    // Checked(Проверяемые) Исключения (Compile Time Exception). Предыдущие Уроки.
    // Исключителный Случаи при Работе Программы.
        // Unchecked(Не Проверяемые) Исключения (Runtime Exception).
        // = Ошибка В Работу Программы. Надо Усранять.

        // Checked(Проверяемые) Исключения. (Compile Time Exception) ->
        String path = "I:\\INTERNET-PRGRAMMING-Java\\IdeaProjects1\\lesson-1\\src\\Lesson39Exception_Part3_ChekedAndUnchekedException\\lesson39.txt";
        File file = new File(path);
 //        System.out.println(File.separator);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            //  throw new RuntimeException(e);
            System.out.println("Файл Не Найден!!!");
        }
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        // Unchecked Exception(Не Проверяемые Исключения) Runtime Exception.
        //int a = 1 / 0; - Ошибка Runtime Exception.

        //String name = null;  // - Ошибка 1 Runtime Exception
        //name lenght;  // Ошибка 1 Runtime Exception.

        try {
            int[] arr = new int[2]; // Ошибка. Runtime Exception
            System.out.println(arr[2]);  // Ошибка. Runtime Exception.
        } catch(RuntimeException e){  // (ArrayIndexOutOfBoundsException e) {
            System.out.println("Такого Индекса Нет.");
        }
    }
}
