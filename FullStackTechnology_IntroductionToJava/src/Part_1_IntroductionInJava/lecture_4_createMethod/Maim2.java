package Part_1_IntroductionInJava.lecture_4_createMethod;

import static Part_1_IntroductionInJava.lecture_4_createMethod.FirstReadingData.first;
import static Part_1_IntroductionInJava.lecture_4_createMethod.FirstReadingData.firstReadingData;
import static Part_1_IntroductionInJava.lecture_4_createMethod.SecondReadingData.second;
import static Part_1_IntroductionInJava.lecture_4_createMethod.SecondReadingData.secondReadingData;
import static Part_1_IntroductionInJava.lecture_4_createMethod.Sum.*;
//

public class Maim2 {
    public static void main(String[] args) {
        int resultSums = sum(firstReadingData(first), secondReadingData(second));

//        int resultSums = sum(first, second);
        System.out.println("Сумма: " + resultSums);
    }
}
