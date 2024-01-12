package Lesson41AbstractClasses;

public class Dog extends Animal{
    @Override  //3
    public void makeSound() {  // 3
        System.out.println("Bark!!!");  // 3
    }  // 3
    //public void makeSound() {  // 2
    //    System.out.println("Make sound");  // 2
    //}  // 2
}
//public class Dog implements AbleToMakeSound {
//
//    @Override
//    public void makeSound() {
//        System.out.println("Bark!");
//    }
//};
