package Part_1_IntroductionInJava.Task_5_Try_Input_Compare_Calc;

import java.util.Scanner;

public class CalculatorReadingOperation {
    static Scanner inputCalculatorOperation = new Scanner(System.in);
    static char calculatorOperationSymbol;
    static int calculatorReadingOperation(char calculatorOperationSymbol) {
        System.out.print("Введите Операцию Для Калькулятора: ");
        calculatorOperationSymbol = inputCalculatorOperation.next().charAt(0);
        return calculatorOperationSymbol;
    }
}
