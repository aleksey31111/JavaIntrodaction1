package Lesson29Polimorfizm;


public class Test{
    public static void main(String[] args) {

//        Animal animal29 = new Animal();
//        Dog dog29 = new Dog();
//
//        animal29.eat();
//        dog29.eat();
//        Animal animal = new Dog();
//        animal.eat(); // Dog.eat() is Execute is Exist.
//        animal.bark(); // Not Execute
//        Dog dog = new Dog();
//        dog.eat();
//        dog.bark();
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        test(animal);
        test(dog);
        test(cat);
    }

    public static void test(Animal animal) {
        animal.eat();
    }
}
