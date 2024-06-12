package Part_1_IntroductionInJava.Task_1_Exemple;

public class Primitive {
    static long longValue = 50;
    static int intValue = 29;
    static byte byteValue = 89;
    static short shortValue =130;
    static float floatValue = 180.98f;
    static double doubleValue = 348.98;
    static void printPrimitives() {
        System.out.println("longValue = " + longValue);
        System.out.println(("intValue = " + intValue));
        System.out.println("byteValue = " + byteValue);
        System.out.println("shortValue = " + shortValue);
        System.out.println("floatValue = " + floatValue);
        System.out.println("doubleValue = " + doubleValue);
    }
    static void operation() {
        int result1 = byteValue + shortValue;
        long result2 = longValue + intValue;
        double result3 = (double) floatValue + doubleValue;
//        DecimalFormat df = new DecimalFormat("#.##");
//        double rounderResult3 = Double.valueOf(df.format(result3));
        double result4 = intValue + doubleValue;
//        DecimalFormat df1 = new DecimalFormat("#.#");
//        double rounderResult4 = Double.valueOf(result4);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(Math.round(result3));
        System.out.println(Math.round(result4));

    }
    public static void sumOfIntAndDouble(int intValue, double doubleValue) {
        System.out.println("Сумма Целых Чисел: " + Math.round(intValue + doubleValue));
    }
    public static  void sumOfFloatAndDouble(float floatValue, double doubleValue) {
        System.out.println("Сумма Чисел Float: " + Math.round(floatValue + doubleValue));
    }
    public static void sumOfByteAndShort(byte byteValue, short shortValue) {
        System.out.println(byteValue + shortValue);
    }
    public static void sumIntAndLong(int intValue, long longValue) {
        System.out.println(intValue + longValue);
    }
    public static void multipleIntAndDouble(int intValue, double doubleValue){
        System.out.printf("%.2f",(intValue * doubleValue));
        System.out.println();
    }

    public static void multipleDoubleAndFloat(double doubleValue, float floatValue){
        System.out.printf("%.2f", (floatValue * doubleValue));
    }

    public static void multipleByteAndAndDouble(byte byteValue, double doubleValue){
//        DecimalFormat df = new DecimalFormat("###.###");
//        System.out.println(df.format(byteValue*byteValue));
        System.out.printf("0.3f", (byteValue * doubleValue));
    }

}

