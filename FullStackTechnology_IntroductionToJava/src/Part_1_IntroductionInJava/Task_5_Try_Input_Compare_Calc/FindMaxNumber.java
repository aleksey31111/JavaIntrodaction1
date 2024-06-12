package Part_1_IntroductionInJava.Task_5_Try_Input_Compare_Calc;
/*
Поиск Максимального Числа в Массиве Используя "Итерацию".
 */

//
//public class FindMaxNumber {
//    public static void findMaxNumber(int[] mass) {
//        int maxNum = mass[0];
//        for (int j: mass) {
//            if (j > maxNum) maxNum = j;
//        }
//        System.out.println("Максимальное Число: " + maxNum);
//    }
//}

/*
    Поиск Максимального Числа В Массиве Используя Streav.
*/
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FindMaxNumber {
    public static void findMaxNumber(int[] mass) {
        IntStream intStream = Arrays.stream(mass);
        OptionalInt optionalInt =intStream.max();
        int maxAsInt = optionalInt.getAsInt();
        System.out.println("Максимальное Число: " + maxAsInt);
    }
}

/*
    Поиск Максимального Числа в Массиве Используя Sort
 */
//import java.util.Arrays;
//import static Part_1_IntroductionWithJava.MassivAndCycleForEachLessonByJava.Task_5_Try_Input_Compare_Calc.RandomMass.mass;

//public class FindMaxNumber{
//    public static void findMaxNumber(int[] mass) {
//        Arrays.sort(mass);
//        System.out.println("Массив Целочисленных Значений После Соптировки: "
//                + Arrays.toString(mass));
//        int maxNum = mass[mass.length - 1];
//        System.out.println("Максимальное число: " + maxNum);
//    }
//}