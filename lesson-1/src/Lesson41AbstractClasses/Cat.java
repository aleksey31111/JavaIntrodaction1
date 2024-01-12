package Lesson41AbstractClasses;

public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Meow!!!");
    }
//    public void makeSound(){  // 1
//        System.out.println("MEOW...");  // 1
//    }  // 1
}
