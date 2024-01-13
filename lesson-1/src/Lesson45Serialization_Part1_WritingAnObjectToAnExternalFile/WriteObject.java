package Lesson45Serialization_Part1_WritingAnObjectToAnExternalFile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Bob");
        Person person2 = new Person(2, "Mike");

        try {
            // Запись Последовательноси Байтов в файл.
            FileOutputStream fos = new FileOutputStream("I:\\INTERNET-PRGRAMMING-Java\\IdeaProjects1\\lesson-1\\src\\Lesson45Serialization_Part1_WritingAnObjectToAnExternalFile\\people.bin");
            // Запись Объектов в Файл.
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(person1);
            oos.writeObject(person2);

            oos.close();
        } catch (IOException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }
    }
}
