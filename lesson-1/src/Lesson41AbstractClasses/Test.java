package Lesson41AbstractClasses;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        //Animal animal = new Animal();  // 0
        // Animal - Абстрактный Метод -  // 0
        // - Не Может Создавать Своих Объектов.  // 0
        cat.eat();
        cat.makeSound();
        dog.eat();
        dog.makeSound();
    }
}
