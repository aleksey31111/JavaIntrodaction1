package Part_1_IntroductionInJava.lecture_10_propertyOOP_interfaces_abstractClass_Polimorfizm.Classes;

//import Part_1_IntroductionWithJava.MassivAndCycleForEachLessonByJava.lecture_10_propertyOOP_interfaces_abstractClass_Polimorfizm.Interface.Animal;

//public class Dog implements Animal {
//    private String name;
//    private int age;
//    private String owner;
//
//    @Override
//    public String getAnimalType() {
////        return null;
//        return "Dog";
//    }
//
//    @Override
//    public void say() {
//        System.out.println("Woof!!!  ");
//    }
//
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public int getAge() {
//        return age;
//    }
//
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

public class Dog extends AbstractAnimal{
    @Override
    public void say() {
        System.out.println("Woof! Abstract Method \"say\" " +
                "\n In Class \"Dog\" " +
                "\n 'Implement' Abstract Class AbstractAnimal" +
                "\n Method \"say()\"! ");
    }
}