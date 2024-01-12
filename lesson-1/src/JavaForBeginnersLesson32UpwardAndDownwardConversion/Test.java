package JavaForBeginnersLesson32UpwardAndDownwardConversion;

public class Test {
    public static void main(String[] args) {
//
//        Dog dog = new Dog();
//        dog.bark();
//        // Upcasting - Восховящее Преобразование.
//        Animal animal = dog;
//        animal.eat();
//
//        // Downcasting - Низсховящее Преобразование.
//        Dog dog2 = (Dog) animal;
//        dog2.bark();
//        dog2.eat();
//
        Animal a = new Animal();
        Dog dog = (Dog) a;
        dog.bark();
    }
}
