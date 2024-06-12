package Part_1_IntroductionInJava.lecture_10_propertyOOP_interfaces_abstractClass_Polimorfizm.Classes;

//import Part_1_IntroductionWithJava.MassivAndCycleForEachLessonByJava.lecture_10_propertyOOP_interfaces_abstractClass_Polimorfizm.Interface.Animal;
// implement(Осуществляьб) Наследование Интерфейса.
//public class Cat implements Animal {
//    private String name;
//    private int age;
//    private String owner;
//     Наследование(inherits) (extends расширять) Абстрактных Классов.
//public class Cat {
//    @Override
//    public String getAnimalType() {
//        return null;
//        return "Cat";
//    }

//    @Override
//    public void say() {
//        System.out.println("Meow!!!  ");
//    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//    public int getAge() {
//        return age;
//    }
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getOwner() {
//        return owner;
//    }
//
//    public void setOwner(String owner) {
//        this.owner = owner;
//    }

//    public void findOwner(Animal animal) {
//        System.out.println(getAnimalType());
//    }
//}


public class Cat extends AbstractAnimal {
    @Override
    public void say() {
        System.out.println("Meow! In Class \"Dog\" " +
                "\n Extends \"AbstractAnimal\" Method \"say()\" " +
                "\n for Abstract Class");
    }

}