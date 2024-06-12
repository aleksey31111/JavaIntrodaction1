package Part_1_IntroductionInJava.Task_5_Example_Input_Compare_Calc;

import java.util.Scanner;

public class ReadFirstNumberForCreateMass {
    static Scanner inputFromCommandLine = new Scanner(System.in);
    static int massLength;
    static int readFirstNumberForCreateMass(int massLength) {
        System.out.print("Введите Первое Число Определяющее Длинну Массива: ");
        massLength = inputFromCommandLine.nextInt();
//        System.out.println(massLength);
        return massLength;
    }

}
