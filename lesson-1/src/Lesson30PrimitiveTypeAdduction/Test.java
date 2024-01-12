package Lesson30PrimitiveTypeAdduction;

public class Test {
    public static void main(String[] args) {
//        int x;
//        short x1;
//        byte x2;
//        long x3;
//        double x4;
//        float x5;
        float f = 123.2f;
        float f1 = (float)123.4;
        long l = 12323232323233L; // Не Явное.
        int x = (int)l;
        System.out.println(x);
        int a = 123;
        long l1 = a;
        int x1 = (int)l1; // Явное.
        System.out.println(x1);
        int a2 = 123;
        double x2 = a2;
        System.out.println(x2);
        double x3 = 123.5;
        int y3 = (int)x3;
        System.out.println(y3);
        long y4 = Math.round(x3);
        System.out.println(y4);
        byte x4 = (byte) 130; // -128 до 127
        System.out.println(x4);
    }
}
