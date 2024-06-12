package Part_1_IntroductionInJava.Task_5_Example_Input_Compare_Calc;

//import static Part_1_IntroductionWithJava.MassivAndCycleForEachLessonByJava.Task_5_Example_Input_Compare_Calc.ReadSecondNumberForSearch.searchNumber;
//import static Part_1_IntroductionWithJava.MassivAndCycleForEachLessonByJava.Task_5_Example_Input_Compare_Calc.SearchNumber.sec
public class Main {
    public static void main(String[] args) {
        CreateMass.createMass(CreateMass.mass);
        SearchNumber.searchNumber(CreateMass.mass);  //, secondNmber);
        SearchMaxNumber.searchMaxNumber(CreateMass.mass);
    }
}
