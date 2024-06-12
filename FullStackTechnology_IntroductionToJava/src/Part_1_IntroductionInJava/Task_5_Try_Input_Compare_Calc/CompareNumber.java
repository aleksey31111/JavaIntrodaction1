package Part_1_IntroductionInJava.Task_5_Try_Input_Compare_Calc;

import static Part_1_IntroductionInJava.Task_5_Try_Input_Compare_Calc.ReadNumberForCompare.readNumber2ForCompare;
import static Part_1_IntroductionInJava.Task_5_Try_Input_Compare_Calc.ReadNumberForCompare.secondNumber;
//import static Part_1_IntroductionWithJava.MassivAndCycleForEachLessonByJava.Task_5_Try_Input_Compare_Calc.ReadNumberForCompare.readNumber2ForCompare;
//import static Part_1_IntroductionWithJava.MassivAndCycleForEachLessonByJava.Task_5_Try_Input_Compare_Calc.ReadNumberForCompare.secondNumber;

public class CompareNumber {

    public static void compareNumber(int[] mass){  //, int secondNumber) {
        int secondNumber1 = readNumber2ForCompare(secondNumber);
//        System.out.println(secondNumber1);
        for (int el : mass) {

            if (el == secondNumber1) {
                System.out.println("Число Найдено: " + el);
            }
            else {
                System.out.println("Совпадений Нет!");
            }

        }
    }
}