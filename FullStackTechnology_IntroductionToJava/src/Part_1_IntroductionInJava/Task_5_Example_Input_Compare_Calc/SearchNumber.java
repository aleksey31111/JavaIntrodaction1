package Part_1_IntroductionInJava.Task_5_Example_Input_Compare_Calc;

import static Part_1_IntroductionInJava.Task_5_Example_Input_Compare_Calc.ReadSecondNumberForSearch.readSecondNumberForSearch;
import static Part_1_IntroductionInJava.Task_5_Example_Input_Compare_Calc.ReadSecondNumberForSearch.searchNumber;

public class SearchNumber {
//    int secondNumber = readSecondNumberForSearch(searchNumber);
//    public int foundNumber;
    public static void searchNumber(int[] mass) {  //, int secondNumber) {
        int secondNumber = readSecondNumberForSearch(searchNumber);
//        System.out.println();
        for (int element: mass) {
            if (element == secondNumber){
//                int foundNumber = element;
//                System.out.println(foundNumber);
//                return foundNumber
                System.out.println("Число найдено: " + element);
            }
        }
//        for (int element:
//             mass) {
//            if (element != secondNumber) {
//                System.out.println("Число Не Найдено!!!");
//            }
//        }

    }

    public static void searchNumber() {
    }
}
