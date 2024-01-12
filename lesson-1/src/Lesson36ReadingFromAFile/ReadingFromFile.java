package Lesson36ReadingFromAFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = "i:" + separator + "INTERNET-PRGRAMMING-Java" + separator + "IdeaProjects1" + separator + "test37.txt";
        File file = new File(path);

        // Поток считывания Данных Из Консоли.
        // Поток Имеет Вход и Выход.
//    Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();

        String separator1 = File.separator;
        String path1 = "i:" + separator1 + "INTERNET-PRGRAMMING-Java" + separator1 + "IdeaProjects1" + separator1 + "testNumber.txt";
        File file1 = new File(path1);
        Scanner scanner1 = new Scanner(file1);
        String line = scanner1.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[3];
        int counter = 0;

        for(String number : numbersString) {
            numbers[counter++] = Integer.parseInt(number);
        }

        System.out.println(Arrays.toString(numbers));

        scanner1.close();

    }

}
