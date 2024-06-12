package Part_1_IntroductionInJava.lecture_11_ClassWrappers_DifferentFromPrimitiveTipe;

public class CompareIntegerInt {
    private Integer firstNumber;
    private int a;
    public CompareIntegerInt(Integer firstNumber, int a) {
        this.firstNumber  = firstNumber;
        this.a = a;
    }
    public Integer getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(Integer firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    public void compareIntegerInt() {
        System.out.print(getFirstNumber() + " == " + getA() + ": ");
        System.out.println(getFirstNumber() == getA());
    }
}
