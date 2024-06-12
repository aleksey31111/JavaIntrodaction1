package Part_1_IntroductionInJava.lecture_10_propertyOOP_interfaces_abstractClass_Polimorfizm;

import Part_1_IntroductionInJava.lecture_10_propertyOOP_interfaces_abstractClass_Polimorfizm.Classes.Cat;
import Part_1_IntroductionInJava.lecture_10_propertyOOP_interfaces_abstractClass_Polimorfizm.Classes.Dog;
import Part_1_IntroductionInJava.lecture_10_propertyOOP_interfaces_abstractClass_Polimorfizm.Interface.Animal;

public class Main {
    public static void main(String[] args) {
        // ПОЛИМОРФИЗМ
//        Animal bagira = new Cat();
        Cat bagira = new Cat();
//        ((Cat) bagira).setName("Bagira");
//        ((Cat) bagira).setAge(100);
//        Animal muhtar = new Dog();
        Dog muhtar = new Dog();
//        ((Dog) muhtar).setName("Muhtar");
//        ((Dog) muhtar).setAge(50);
//        Animal zhirik = new Cat();
        Cat zhirik = new Cat();
        ((Cat) zhirik).setName("Zhirik");
        ((Cat) zhirik).setAge(10);


        bagira.say();
        zhirik.say();
        muhtar.say();

        findOwner(bagira);
        findOwner(muhtar);
        findOwner(zhirik);

//        System.out.println(" Bagira: " + ((Cat)bagira).getOwner()
//                + "\n Zhirik: " + ((Cat)zhirik).getOwner()
//        + "\n Muhtar: " + ((Dog) muhtar).getOwner());

        System.out.println(" Bagira: " + bagira.getOwner()
                + "\n Zhirik: " + zhirik.getOwner()
                + "\n Muhtar: " + muhtar.getOwner());

//        System.out.println("Name: " + ((Cat) bagira).getName() + ", " +
//                "Age: " + ((Cat) bagira).getAge() + ", " +
//                "Owner: " + ((Cat) bagira).getOwner());
//        System.out.println("Name: " + ((Cat) zhirik).getName() + ", " +
//                "Age: " + ((Cat) zhirik).getAge() + ", " +
//                "Owner: " + ((Cat) zhirik).getOwner());
//        System.out.println("Name: " + ((Dog) muhtar).getName() + ", " +
//                "Age: " + ((Dog) muhtar).getAge() + ", " +
//                "Ownet: " + ((Dog) muhtar).getOwner());


    }
    // getAnimalType - Class "Cat" and "Dog"
//    private static void findOwner(Animal animal) {
//        if (animal.getAnimalType().equals("Cat")) {
//            Cat someCat = (Cat) animal;
//            someCat.setOwner("Cat_Owner");
//        }
//        if (animal.getAnimalType().equals("Dog")) {
//            Dog someDog = (Dog) animal;
//            someDog.setOwner("Dog_Owner");
//        }
//    }
    // setOwner - in Interface "Animal"
//    private static void  findOwner(Animal animal) {
//        if (animal.getAnimalType().equals("Cat")) {
//            animal.setOwner("Cat_Owner");
//        }
//        if (animal.getAnimalType().equals("Dog")) {
//            animal.setOwner("Dog_Owner");
//        }
//}

    // setOwner - in Interface "Animal",
    // Use Class "Object" Method "getClass"
//   private static void findOwner(Animal animal) {
//        if (animal.getClass() == Cat.class) {
//            animal.setOwner(("Cat_Owner"));
//        }
//        if (animal.getClass() == Dog.class) {
//            animal.setOwner("Dog_Owner");
//        }
//   }

    // setOwner - in AbstractClass "AbstractAnimal",
    // Use Class "Object" Method "getClass".
//    private static void findOwner(AbstractAnimal animal) {
//        if (animal.getClass()==Cat.class) {
//            animal.setOwner("Cat_Owner!");
//        }
//        if (animal.getClass()==Dog.class) {
//            animal.setOwner("Dog_Owner!");
//        }
//    }

    // After abstract class "AbstractAnimal" Implement,
    // Interface "Animal", Return "Animal" on Place "AbstractAnimal".
    private static void findOwner(Animal animal) {
        if (animal.getClass()==Cat.class) {
            animal.setOwner("Cat_Owner");
        }
        if (animal.getClass()==Dog.class) {
            animal.setOwner("Dog_Owner");
        }
    }

}
