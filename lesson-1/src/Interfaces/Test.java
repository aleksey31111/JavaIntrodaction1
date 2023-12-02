package Interfaces;

public class Test {
    public static void main(String[] args) {
//        Animal animal1 = new Animal(1);
//        Person person1 = new Person("Bob");
//        animal1.showInfo();
//        animal1.sleep();
//        person1.showInfo();
//        person1.sayHello();
//        Info info1 = new Animal(1);
//        Info info2 = new Person("Bob");
//        info1.showInfo();
//        info2.showInfo();
//        outputInfo(info1);
//        outputInfo(info2);
        Animal animal1 = new Animal(1);
        Person person2 = new Person("Bob");
        outputInfo(animal1);
        outputInfo(person2);
    }
    public static void outputInfo(Info info){
        info.showInfo();
    }
}
