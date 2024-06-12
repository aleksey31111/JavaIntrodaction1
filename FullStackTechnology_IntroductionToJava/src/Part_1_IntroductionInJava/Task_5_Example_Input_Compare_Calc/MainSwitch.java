package Part_1_IntroductionInJava.Task_5_Example_Input_Compare_Calc;

import java.util.Scanner;

public class MainSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите Первое Число: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Введите Второе Число: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Выберите Операцию: " +
                "1 - Сложение, 2 - Вычмтание(1-2), 3 - Вычмтание(2-1) \n");
        System.out.println("6 - Деление с Остатком(1%2), 7 - Деление с Остатком(2%1).");
        int operation = scanner.nextInt();
        switch (operation) {
            case 1:
                int resultSum = firstNumber + secondNumber;
                System.out.println(firstNumber + " + " + secondNumber + " = " + resultSum);
                break;
            case 2:
                int resultSubtraction12 = firstNumber - secondNumber;
                System.out.println(firstNumber + " - " + secondNumber + " = " + resultSubtraction12);
                break;
            case 3:
                int resultSubtraction21 = secondNumber - firstNumber;
                System.out.println(secondNumber + " - " + firstNumber + " = " + resultSubtraction21);
                break;
            case 4:
                int resultIntDivision12 = firstNumber / secondNumber;
                System.out.println( firstNumber + " / " + secondNumber + " = " + resultIntDivision12);
                break;
            case 5:
                int resultIntDivision21 = secondNumber / firstNumber;
                System.out.println( secondNumber + " / " + firstNumber + " = " + resultIntDivision21);
                break;
            case 6:
                int resultDivisionRemainder12 = firstNumber % secondNumber;
                System.out.println(firstNumber + " % " + secondNumber + " = " + resultDivisionRemainder12);
                break;
            case 7:
                int resultDivisionRemainder21 = secondNumber % firstNumber;
                System.out.println( secondNumber + " % " + firstNumber + " = " + resultDivisionRemainder21);
                break;
            default:
                System.out.println("Проверьте Введённую Операцию");
        }
    }
}
