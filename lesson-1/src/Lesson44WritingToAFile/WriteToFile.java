package Lesson44WritingToAFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File fileWrite = new File("i:\\INTERNET-PRGRAMMING-Java\\IdeaProjects1\\lesson-1\\src\\Lesson44WritingToAFile\\testFile");
        PrintWriter pw = new PrintWriter(fileWrite);

        System.out.println(System.in);
//        pw.println("\t\tWriting To A File!!!");
        pw.println("Today is 13.01.2024. I have hospital list.");
        pw.println("Tomorow will be 14.01.2024. I go to the market of Andrew.");
        pw.close();

        ReadToAFile.readToFile();
    }
}

class ReadToAFile {
    public static void readToFile() throws FileNotFoundException {
        File fileRead = new File("i:\\INTERNET-PRGRAMMING-Java\\IdeaProjects1\\lesson-1\\src\\Lesson44WritingToAFile\\testFile");
        Scanner scanner = new Scanner(fileRead);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}