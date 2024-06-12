package Lesson47Serialization_Part3_Transient_SerialVersionUID;

import java.io.Serializable;
public class Person implements Serializable {
    private transient int id;  // Поле которое Не Будет Сериализованно(transient) = 0
    private /*transient*/ String name;  // Поле которое не будет Сериализованно(transient) = null



    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String toString() {
        return id + " : " + name;
    }
}
