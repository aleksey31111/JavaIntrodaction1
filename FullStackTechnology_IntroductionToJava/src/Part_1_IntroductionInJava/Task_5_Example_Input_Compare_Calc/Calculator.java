package Part_1_IntroductionInJava.Task_5_Example_Input_Compare_Calc;


import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import static Part_1_IntroductionInJava.Task_5_Example_Input_Compare_Calc.ReadFirstCalculatorNumber.readFirstCalculatorNumber;
import static Part_1_IntroductionInJava.Task_5_Example_Input_Compare_Calc.ReadSecondCalculatorNumber.readSecondCalculatorNumber;
import static java.lang.Math.ceil;
import static java.lang.Math.pow;
//import static Part_1_IntroductionWithJava.MassivAndCycleForEachLessonByJava.Task_5_Example_Input_Compare_Calc.ReadSecondCalculatorNumber.number2;

public class Calculator {
    static void calculator(double number1, double number2) {  //, String operationC) {
        double numberF = readFirstCalculatorNumber(number1);
        double numberS = readSecondCalculatorNumber(number2);
//        String operationC = ReadOperationCalculator.readOperationCalculator(operationCalculator);
        switch (ReadOperationCalculator.readOperationCalculator(ReadOperationCalculator.operationCalculator)) {
            case "+":
                double resultSum = numberF + numberS;
                System.out.println(numberF + " + " + numberS + " = " + resultSum);
                break;
            case "-12":
                double scale = pow(10, 3);
                double resultSubtraction12 = ceil(((numberF - numberS)*scale)/scale);
                System.out.println(numberF + " - " + numberS + " = " + resultSubtraction12);
                break;
            case "-21":
                double resultSubtraction21 = numberS - numberF;
                MathContext contexts = new MathContext(5, RoundingMode.HALF_UP);
                BigDecimal results = new BigDecimal(resultSubtraction21, contexts);
                System.out.println(numberS + " - " + numberF + " = " + results);  //  + resultSubtraction21);
                break;
            case "/12":
                double resultIntDivision12 = numberF / numberS;
                MathContext contextD = new MathContext(5, RoundingMode.HALF_UP);
                BigDecimal resultD = new BigDecimal(resultIntDivision12, contextD);
                System.out.println( numberF + " / " + numberS + " = " + resultD);
                break;
            case "/21":
                double resultIntDivision21 = numberS / numberF;
                MathContext contextId = new MathContext(5, RoundingMode.HALF_UP);
                BigDecimal resultId = new BigDecimal(resultIntDivision21, contextId);
                System.out.println( numberS + " / " + numberF + " = " + resultId);
                break;
            case "%12":
                double resultDivisionRemainder12 = numberF % numberS;
                MathContext contextDR = new MathContext(5, RoundingMode.HALF_UP);
                BigDecimal resultDR = new BigDecimal(resultDivisionRemainder12, contextDR);
                System.out.println(numberF + " % " + numberS + " = " + resultDR);
                break;
            case "%21":
                double resultDivisionRemainder21 = numberS % numberF;
                MathContext contextdr = new MathContext(5, RoundingMode.HALF_UP);
                BigDecimal resultdr = new BigDecimal(resultDivisionRemainder21, contextdr);
                System.out.println( numberS + " % " + numberF + " = " + resultdr);
                break;
            default:
                System.out.println("Проверьте Введённую Операцию");
        }
    }
}
