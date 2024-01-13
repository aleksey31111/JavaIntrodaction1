package Lesson45Serialization_Part1_WritingAnObjectToAnExternalFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("I:\\INTERNET-PRGRAMMING-Java\\IdeaProjects1\\lesson-1\\src\\Lesson45Serialization_Part1_WritingAnObjectToAnExternalFile\\people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person person1 = (Person) ois.readObject();
            Person person2 = (Person) ois.readObject();

            System.out.println(person1);
            System.out.println(person2);

            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
