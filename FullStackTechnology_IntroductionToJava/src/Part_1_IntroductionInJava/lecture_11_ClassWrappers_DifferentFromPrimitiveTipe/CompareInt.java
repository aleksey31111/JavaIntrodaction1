package Part_1_IntroductionInJava.lecture_11_ClassWrappers_DifferentFromPrimitiveTipe;

public class CompareInt {
    private int a;  // = 15;
    private int b;  // = 15;
    public CompareInt(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    public void compareInt() {
        System.out.print("a=" + a + " == " + "b=" + b + ": ");
        System.out.println(a == b);
    }
//    public void equalsInt() {
//        System.out.print("a.equals(b): ");
//        System.out.println(a.equals(b));
//    }
}
