package Part_1_IntroductionInJava.Task_5_Example_Input_Compare_Calc;

//import Part_1_IntroductionWithJava.MassivAndCycleForEachLessonByJava.Task_5_Example_Input_Compare_Calc.ReadFirstNumberForCreateMass.massLength;

import java.util.Random;

import static Part_1_IntroductionInJava.Task_5_Example_Input_Compare_Calc.ReadFirstNumberForCreateMass.massLength;
import static Part_1_IntroductionInJava.Task_5_Example_Input_Compare_Calc.ReadFirstNumberForCreateMass.readFirstNumberForCreateMass;
public class CreateMass {
//    static int[] mass;
    static int[] mass = new int[readFirstNumberForCreateMass(massLength)];
    static void createMass(int[] mass) {

        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(30);
            System.out.print(i + ": " + mass[i] + "; ");
        }
        System.out.println();
    }
}
