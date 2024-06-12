package Part_1_IntroductionInJava.lecture_11_ClassWrappers_DifferentFromPrimitiveTipe;

public class CompareInteger {
    private Integer firstNumber; // = new Integer(10);
    private Integer secondNumber;  // = new Integer(10);

    public CompareInteger(Integer firstNumber, Integer secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
    public Integer getFirstNumber() {
        return firstNumber;
    }
    public void setFirstNumber(Integer firstNumber) {
        this.firstNumber = firstNumber;
    }

    public Integer getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(Integer secondNumber) {
        this.secondNumber = secondNumber;
    }
    public void compareInteger() {
        System.out.print(firstNumber + " == " + secondNumber + ": ");
        System.out.println(firstNumber == secondNumber);
    }
    public void equalsInteger() {
        System.out.print(firstNumber + ".equals(" + secondNumber + "): ");
        System.out.println(firstNumber.equals(secondNumber));
    }
}
