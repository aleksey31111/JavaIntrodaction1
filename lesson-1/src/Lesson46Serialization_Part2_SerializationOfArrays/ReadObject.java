package Lesson46Serialization_Part2_SerializationOfArrays;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("I:\\INTERNET-PRGRAMMING-Java\\IdeaProjects1\\lesson-1\\src\\Lesson46Serialization_Part2_SerializationOfArrays\\people46");
            ObjectInputStream ois = new ObjectInputStream(fis);

//            Person person1 = new Person(1, "Bob46"); // Из урока 45
//            Person person2 = new Person(2, "Tom46"); // Из урока 45

            // Первый способ Чтения Массива
            //int personCount = ois.readInt();
            //Person[] people = new Person[personCount];

//            System.out.println(person1); // Из Урока 45
//            System.out.println(person2); // Из Урока 45

            // Продолжение 1 Способа Записи Массива
            //for(int i = 0; i < personCount; i++) {
            //    people[i] = (Person)ois.readObject();
            //}

            // Второй способ Чтения из Массива
            Person[] people = (Person[ ])ois.readObject();

            System.out.println(Arrays.toString(people));

            ois.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
