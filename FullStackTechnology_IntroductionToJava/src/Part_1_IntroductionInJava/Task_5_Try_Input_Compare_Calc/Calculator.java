package Part_1_IntroductionInJava.Task_5_Try_Input_Compare_Calc;

public class Calculator {
    public static void calculator(int firstCalculatorNumber, int secondCalculatorNumber) {
//        int firstCalcNumber;
        int firstCalcNumber = FirstCalculatorReadingNumber.firstCalculatorReadingNumber(firstCalculatorNumber);
        int secondCalcNumber = SecondCalculatorReadingNumber.secondCalculatorReadingNumber(secondCalculatorNumber);
//        char calculatorOperationSymbol;
        switch (CalculatorReadingOperation.calculatorReadingOperation(CalculatorReadingOperation.calculatorOperationSymbol)) {
            case '+':
                int my_result = firstCalcNumber + secondCalcNumber;
                System.out.println(firstCalcNumber + " + " + secondCalcNumber + " = " + my_result);
                break;
            case '-':
                my_result = firstCalcNumber - secondCalcNumber;
                System.out.println(firstCalcNumber + " - " + secondCalcNumber + " = " + my_result);
                break;
            case '*':
                my_result = firstCalcNumber * secondCalcNumber;
                System.out.println(firstCalcNumber + " * " + secondCalcNumber + " = " + my_result);
                break;
            case '/':
                my_result = firstCalcNumber / secondCalcNumber;
                System.out.println(firstCalcNumber + " / " + secondCalcNumber + " = " + my_result);
            case '%':
                my_result = firstCalcNumber % secondCalcNumber;
                System.out.println(firstCalcNumber + " % " + secondCalcNumber + " = " + my_result);
                break;
            default:
                System.out.println("Не правильно Введена Операция:");
                break;

        }
    }
}
