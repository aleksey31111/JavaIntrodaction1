package Lesson29Polimorfizm;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Dog is Eating...");
    }
    public void bark() {
        System.out.println("Dog is barking...");
    }
}
