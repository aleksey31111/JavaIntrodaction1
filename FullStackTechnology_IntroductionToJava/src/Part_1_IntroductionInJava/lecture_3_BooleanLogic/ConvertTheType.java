package Part_1_IntroductionInJava.lecture_3_BooleanLogic;

public class ConvertTheType {
    static int a = 100;
    static byte b = (byte) a;
    static short c = b;
    static long d = a;
    static void printConvertType() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
