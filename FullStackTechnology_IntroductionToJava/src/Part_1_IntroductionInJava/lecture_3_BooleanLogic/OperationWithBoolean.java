package Part_1_IntroductionInJava.lecture_3_BooleanLogic;

public class OperationWithBoolean {
    static int a = 10;
    static int b = 17;
    static int c = 10;
    static void printBooleanVariable() {
        System.out.println("a = " + a + ", " + "b = " + b + ", " + "c = " + c + ".");
    }
    static void booleanOperation() {
        boolean aMoreB = a > b;
        System.out.println("a > b : " + aMoreB);
        System.out.print("a == c : ");
        System.out.println(a==c);
        System.out.print("a + 7 = b : ");
        System.out.println(a + 7 == b);
        System.out.print("b > c : ");
        System.out.println(b > c);
        System.out.print("a != c : ");
        System.out.println(a != c);
        System.out.print("c < a : " );
        System.out.println(c < a);
        System.out.print("a >= c: ");
        System.out.println(a >= c);

    }
}
