package Lesson46Serialization_Part2_SerializationOfArrays;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
//        Person person1 = new Person(1, "Bob46");
//        Person person2 = new Person(2, "Tom46");
        Person[] people = {new Person(1, "Bob46"), new Person(2, "Mike46"), new Person(3, "Tom46")};

        try {
            FileOutputStream fos = new FileOutputStream("I:\\INTERNET-PRGRAMMING-Java\\IdeaProjects1\\lesson-1\\src\\Lesson46Serialization_Part2_SerializationOfArrays\\people46");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // Первый Способ Записи Массива
            //oos.writeInt(people.length);

            //for (Person person : people) {
            //    oos.writeObject(person);
            //}

            oos.writeObject(people);

            oos.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
