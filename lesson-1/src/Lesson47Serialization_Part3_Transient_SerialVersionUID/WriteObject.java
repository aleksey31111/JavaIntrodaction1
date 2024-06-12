package Lesson47Serialization_Part3_Transient_SerialVersionUID;



import java.io.*;

public class WriteObject {
    public static void main(String[] args) {
//        Person[] people = {new Person(1, "Bob"), new Person(2, "Mike"), new Person(3, "Mike"), new Person(4, "Pendergast")};
        Person person = new Person(1, "Mike");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("I:\\INTERNET-PRGRAMMING-Java\\IdeaProjects1\\lesson-1\\src\\Lesson47Serialization_Part3_Transient_SerialVersionUID\\people47.bin"))) {
//            FileOutputStream fos = new FileOutputStream("I:\\INTERNET-PRGRAMMING-Java\\IdeaProjects1\\lesson-1\\src\\Lesson47Serialization_Part3_Transient_SerialVersionUID\\people47.bin");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(person);

//            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
