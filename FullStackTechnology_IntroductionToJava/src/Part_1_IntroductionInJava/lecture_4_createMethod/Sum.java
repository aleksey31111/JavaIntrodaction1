package Part_1_IntroductionInJava.lecture_4_createMethod;
// import Lecture_4_createMethod.FirstReadingData.*;
// import Lecture_4_createMethod.SecondReadingData.*;

public class Sum {
//    public static int sum(int sumOfInput) {
//        firstReadingData(first);
//        secondReadingData(second);
//        sumOfInput = first + second;
//        return sumOfInput;
//    }


//        firstReadingData(first);
//        secondReadingData(second);
//        int sumOfInput = first + second;
//        System.out.println(sumOfInput);
//static Scanner inputFirstNumber = new Scanner(System.in);
//    static int first;
//
//    public static int firstReadingData(int firstNumber) {
//        System.out.print("Введите Первое Число: ");
//        firstNumber = inputFirstNumber.nextInt();
//        System.out.println();
//        return firstNumber;
//    }
//    static Scanner inputSecondNumber = new Scanner(System.in);
//    static int second;
//    public static int secondReadingData(int secondNumber) {
//        System.out.print("Введите Второе Число: ");
//        secondNumber = inputSecondNumber.nextInt();
//        return secondNumber;
//    }
    public static int sum(int firstNumber, int secondNumber) {
        int result = 0;
        result = firstNumber +secondNumber;
        return result;
    }


}
