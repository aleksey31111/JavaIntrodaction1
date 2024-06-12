package Part_1_IntroductionInJava.Task_1_Exemple;

import static Part_1_IntroductionInJava.Task_1_Exemple.Primitive.*;

//import Primitive;
public class Main {
    public static void main(String[] args) {
        Primitive.printPrimitives();
        Primitive.operation();
        sumOfIntAndDouble(intValue, doubleValue);
        sumOfFloatAndDouble(floatValue, doubleValue);
        sumOfByteAndShort(byteValue, shortValue);
        sumIntAndLong(intValue, longValue);
        multipleIntAndDouble(intValue, doubleValue);
        multipleDoubleAndFloat(doubleValue, floatValue);
    }
}
