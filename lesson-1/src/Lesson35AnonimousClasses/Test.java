package Lesson35AnonimousClasses;


//class Animal {
//    public void eat() {
//        System.out.println("Animal is eating...");
//    }
//}
//class OtherAnimal extends Animal {
//    public void eat() {
//        System.out.println("Other Animal is Eating...");
//    }
//} Переопределение Класса Animal

interface AbleToEat {
    public void eat();
}
//class Animal implements AbleToEat {
//
//    public void eat() {
//        System.out.println("asdfasfq");
//    }
//}
public class Test {
    public static void main(String[] args) {
//        Animal animal = new Animal();
//        animal.eat();
//
////        OtherAnimal otherAnimal = new OtherAnimal(); // 2
////        otherAnimal.eat(); // Переопределение Классф Animal // 2
//        Animal animal2 = new Animal(){  // 2
//            public void eat(){
//                System.out.println("Other Animal is eating...");
//            }
//        };
//        animal2.eat();  //2

        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Someone is eating...");
            }
        };

        ableToEat.eat();
    }
}
