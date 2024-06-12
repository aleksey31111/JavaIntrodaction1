package Part_1_IntroductionInJava.Task_5_Example_Input_Compare_Calc;

public class SearchMaxNumber {
    public static void searchMaxNumber(int[] mass) {
        int max = mass[0];
        for (int element:
             mass) {
            if (element > max) {
                max = element;
            }
        }
        System.out.println("Максимальное Значение: " + max);
    }
}
