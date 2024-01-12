package Lesson37Exceptions_Part1_ExeptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) {
//        String separator = File.separator;
//        String path ="i:" + separator + "INTERNET-PRGRAMMING-Java" + separator + "IdeaProjects1" +
//                separator + "lesson" + separator + "src" + separator +
//                "Lesson37Exceptions_Part1_ExeptionHandling" + separator + "test37.txt";
//        String path = "i:" + separator + "INTERNET-PRGRAMMING-Java" + separator +
//        "IdeaProjects1" + separator +
//                "test37";
//        I:\INTERNET-PRGRAMMING-Java\IdeaProjects1\lesson-1
//        String path = "I:/INTERNET-PRGRAMMING-Java/IdeaProjects1/lesson-1/test37"; // /src/Lesson37Exceptions_Part1_ExeptionHandling/test37.txt";
//        String path = "i:" +separator+ "INTERNET-PRGRAMMING-Java" + separator + "lesson37.txt";
        String separator = File.separator;
//        lesson-1
        String path = "i:" + separator + "INTERNET-PRGRAMMING-Java" + separator + "IdeaProjects1" + separator + "lesson-1" + separator + "src" + separator + "Lesson37Exceptions_Part1_ExeptionHandling" + separator + "lesson37.txt";
        String path1 = "i:" + separator + "INTERNET-PRGRAMMING-Java" + separator + "IdeaProjects1" + separator + "lesson-1" + separator + "src" + separator + "Lesson37Exceptions_Part1_ExeptionHandling" + separator + "lesson37";
        String path2 = "i:" + separator + "INTERNET_PRGRAMMING-Java" + separator + "IdeaProjects1" + separator + "lesson-1" + separator + "stc" + separator + "NotFound";
        File file = new File(path);
        File file1 = new File(path1);
        File file2 = new File(path2);

        try{
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
            System.out.println("После Нулевого Scanner");
        } catch (FileNotFoundException e) {
            System.out.println("Файл Не Найден...");
//            e.printStackTrace();  // 2

//            throw new RuntimeException(e);  // 1
        }
        System.out.println("После 0 Блока Try Catch");




        try {
            Scanner scanner = new Scanner(file1);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
            System.out.println("После 1 Scanner");
        } catch (FileNotFoundException e) {
            System.out.println("Файл Не Найден...");
//            e.printStackTrace();  // 2

//            throw new RuntimeException(e);  // 1
        }
        System.out.println("После 1 Блока Try Catch");

        try {
            Scanner scanner = new Scanner(file1);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
            System.out.println("После Блока 2 Scanner");
        } catch (FileNotFoundException e){
            System.out.println("Файл Не Найден!!!");

        }
        System.out.println("После Блока 2 Try Catch");

        System.out.println();
        try{
            readFile();
        } catch (FileNotFoundException e){
            System.out.println("Обработка Исключений В Методе main");
        }
    }

    public static void readFile() throws FileNotFoundException {
        File file3 = new File("lesson37");
        Scanner scanner = new Scanner(file3);

    }
}

