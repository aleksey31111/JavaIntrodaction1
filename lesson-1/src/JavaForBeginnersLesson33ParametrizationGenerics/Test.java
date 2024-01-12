package JavaForBeginnersLesson33ParametrizationGenerics;

import JavaForBeginnersLesson32UpwardAndDownwardConversion.Animal;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ///////////// Java 5 ///////////////////
        List animals = new ArrayList();
//        Animal1 ourAnimal = new Animal1();

        animals.add("Cat");
        animals.add("dog"); // 1
        animals.add("frog");
//        Object ourAnimals = null;
//        animals.add(ourAnimals);

        String animal = (String) animals.get(0);
        System.out.println(animal);

        ////// С появлением Generic ///////
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");

        String animal2 = animals2.get(1);
        System.out.println(animal2);

        ////////////// Java 7 //////////////////
        List<String> animals3 = new ArrayList<>();
        animals3.add("cat");
        animals3.add("dog");
        animals3.add("frog");
        String animal3 = animals3.get(2);
        System.out.println(animal3);
    }

}

//class Animal1 {
//
//}