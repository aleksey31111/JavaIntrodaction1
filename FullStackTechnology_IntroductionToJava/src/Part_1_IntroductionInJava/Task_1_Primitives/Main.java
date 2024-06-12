package Part_1_IntroductionInJava.Task_1_Primitives;

public class Main {
    public static void main(String[] args) {
          Primitives.printPrimitives();
          Primitives.operationsSum();
    }
//    private void main(){}


    }
class Primitives {
    //        int intNumber = 1313131313;
//        long longNumber = 1313131313131313131L;
//        byte byteNumber = 13;
//        short shortNumber = 255;
//        boolean booleanVariable = true;
//        char charLetter = 't';
//        float floatNumber = 13.13f;
    static int intNumber = 131;
    static long longNumber = 1313131313131313131L;
    static byte byteNumber = 13;
    static short shortNumber = 255;
    static boolean booleanVariable = true;
    static char charLetter = 't';
    static float floatNumber = 13.13f;
    public static void printPrimitives() {

        System.out.println("Целое Число: " + intNumber);
        System.out.println("Целое число в 2^32 раза больше целого: " + longNumber);
        System.out.println("Байт: " + byteNumber);
        System.out.println("Число размером 2 байта ( 16 бит ): " + shortNumber);
        System.out.println("Логическая переменная: " + booleanVariable);
        System.out.println("Символьная переменная: " + charLetter);
        System.out.println("Число двойной точности: " + floatNumber);
    }
//    public static void printOperations(){
//
//        System.out.println("Суммирование Int: " + Primitives.intNumber + Primitives.intNumber);
//    }
    public static void operationsSum() {
        int intSum = Primitives.intNumber + Primitives.intNumber;
        System.out.println("Сумма Целых Чисел: " + intSum);
        long sumIntLong = (intNumber + longNumber);
        System.out.println("Сумма int и long: " + sumIntLong);
        int sumIntBate = intNumber + byteNumber;
        System.out.println("Сумма Int и Byte: " + sumIntBate);
    }
}
