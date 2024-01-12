package Lesson34GenericWildcards;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));
        listOfAnimal.add(new Animal(5));
        listOfAnimal.add(new Animal(7));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog(3));
        listOfDogs.add(new Dog(4));
        listOfDogs.add(new Dog(6));
        listOfDogs.add(new Dog(8));

        test(listOfAnimal);
        test(listOfDogs);

        /*
            Object
            Animal
            Dog
         */

    }

//    private static void test37(Animal animal) {}

//    private static void test37(List<Animal> list) {
    // Видит тщ Что Ниже extends
    private static void test(List<? extends Animal> list) {
        for(Animal animal : list) {
            System.out.println(animal);
            animal.eat();
        }
    }
    // Видит То Что Ниже.
//    private static void test37(List<? super Animal> list) {
//        for(Animal animal : list) {
//            System.out.println(animal);
//            animal.eat();
//        }
//    }
}
