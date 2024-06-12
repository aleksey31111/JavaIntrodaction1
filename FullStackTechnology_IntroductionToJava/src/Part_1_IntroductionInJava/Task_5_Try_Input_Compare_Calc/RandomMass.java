package Part_1_IntroductionInJava.Task_5_Try_Input_Compare_Calc;
import static Part_1_IntroductionInJava.Task_5_Try_Input_Compare_Calc.ReadNumberFromTheConsole.input1Number;
import static Part_1_IntroductionInJava.Task_5_Try_Input_Compare_Calc.ReadNumberFromTheConsole.read1NumberFromConsole;

public class RandomMass {
    static int[] mass = new int[read1NumberFromConsole(input1Number)];
//    public static void createMass() {
    public static void createMass() {
        for (int i = 0; i < mass.length; i++ ) {
            int newElement = (int)(Math.random() * 100);
            mass[i] = newElement;
//            return mass[i];
        }
    }
    public static void printMass1(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            System.out.print(i + " : " + mass[i] + "; ");
        }
        System.out.println();
    }
    public static void printMass2(int[] mass) {
        for (int el : mass) {
            System.out.print(el + " ");
        }
        System.out.println();
    }
}
