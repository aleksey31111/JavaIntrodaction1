package Part_1_IntroductionInJava.lecture_11_ClassWrappers_DifferentFromPrimitiveTipe;

public class EqualsIntegerInt {
    private Integer secondNumber;
    private int b;
    public EqualsIntegerInt(int b, Integer secondNumber) {
        this.b = b;
        this.secondNumber = secondNumber;
    }
    public Integer getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(Integer secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    public void equalsIntegerInt() {
        System.out.print(secondNumber+".equals("+b+");= ");
        System.out.println(secondNumber.equals(b));
    }

    @Override
    public String toString() {
        return "EqualsIntegerInt{" +
                "secondNumber=" + secondNumber +
                ", b=" + b +
                '}';
    }
}
