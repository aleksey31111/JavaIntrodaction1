package Part_1_IntroductionInJava.Task_5_Try_Input_Compare_Calc;

//import static Part_1_IntroductionWithJava.MassivAndCycleForEachLessonByJava.Task_5_Try_Input_Compare_Calc.FirstCalculatorReadingNumber.firstCalculatorNumber;
//import static Part_1_IntroductionWithJava.MassivAndCycleForEachLessonByJava.Task_5_Try_Input_Compare_Calc.Calculator


public class Main {
    public static void main(String[] args) {
//        read1NumberFromConsole(input1Number);
        RandomMass.createMass();
        RandomMass.printMass1(RandomMass.mass);
//        printMass2(mass);
//        readNumber2ForCompare(secondNumber);

//        if(CompareNumber.compareNumber(mass) == secondNumber) {
//            System.out.print("Сoвпадение Нашлось");
        CompareNumber.compareNumber(RandomMass.mass);  //, secondNumber);
//        }else{
//            System.out.println("Совпадений нет.");
//        }

        FindMaxNumber.findMaxNumber(RandomMass.mass);
        Calculator.calculator(FirstCalculatorReadingNumber.firstCalculatorNumber, SecondCalculatorReadingNumber.secondCalculatorNumber);


    }
}
