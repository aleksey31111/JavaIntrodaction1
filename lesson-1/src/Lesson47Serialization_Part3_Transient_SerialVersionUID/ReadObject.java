package Lesson47Serialization_Part3_Transient_SerialVersionUID;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("I:\\INTERNET-PRGRAMMING-Java\\IdeaProjects1\\lesson-1\\src\\Lesson47Serialization_Part3_Transient_SerialVersionUID\\people47.bin"))) {
//            FileInputStream fis = new FileInputStream("I:\\INTERNET-PRGRAMMING-Java\\IdeaProjects1\\lesson-1\\src\\Lesson47Serialization_Part3_Transient_SerialVersionUID\\people47.bin");
//            ObjectInputStream ois = new ObjectInputStream(fis);

            //Person[] people = (Person[ ])ois.readObject();  // Пример Записи Массива
            Person person1 = (Person) ois.readObject();

            //System.out.println(Arrays.toString(people));  // Пример Записи Массива
            System.out.println(person1);

//            ois.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
