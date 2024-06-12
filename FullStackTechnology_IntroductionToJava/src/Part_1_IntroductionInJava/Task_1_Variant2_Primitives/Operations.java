package Part_1_IntroductionInJava.Task_1_Variant2_Primitives;


import static Part_1_IntroductionInJava.Task_1_Variant2_Primitives.Primitives.intNumber;
import static Part_1_IntroductionInJava.Task_1_Variant2_Primitives.Primitives.longNumber;
import static Part_1_IntroductionInJava.Task_1_Variant2_Primitives.Primitives.byteNumber;
import static Part_1_IntroductionInJava.Task_1_Variant2_Primitives.Primitives.shortNumber;


public class Operations {
    static void sumInt() {
        int sumInt = intNumber + intNumber;
        System.out.println("Суммирование Int: " + sumInt);
    }
    static void sumLong(){
        long sumLong = longNumber + longNumber;
        System.out.println("Суммирование Long: " + sumLong);
    }
    static void sumByte() {
        short sumByte = (short) (byteNumber + byteNumber);
        System.out.println("Сумма Byte: " + sumByte);
    }
    static void sumShort() {
        int sumShort = (int) shortNumber + (int) shortNumber;
        System.out.println("Сумма Short: " + sumShort);
    }
}
