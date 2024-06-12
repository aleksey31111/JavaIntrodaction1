package Part_1_IntroductionInJava.lecture_11_ClassWrappers_DifferentFromPrimitiveTipe;

public class Main {
//    public Main(){
//        super();
//    }
    public static void main(String[] args) {
//        System.out.println(CreateInt.getA);
//        CreateInteger integerFirstSecond = new CreateInteger();
//        CreateInt intAB= new CreateInt();
//        integerFirstSecond.compareInteger();
//        integerFirstSecond.equalsInteger();
//        intAB.compareInt();

        CompareInteger createIntegerFirstSecond = new CompareInteger(14, 14);
        CompareInteger compareInteger = new CompareInteger(14,1);
        EqualsIntegerInt equalsIntegerInt = new EqualsIntegerInt(13,13);
        EqualsIntegerInt equalsIntegerInt11 = new EqualsIntegerInt(13,3);
        CompareInt createIntab = new CompareInt(9,9);
        CompareInt compareIntab1 = new CompareInt(9,1);
        CompareIntegerInt compareIntegerInt = new CompareIntegerInt(13,13);
        CompareIntegerInt compareIntegerInt1 = new CompareIntegerInt(12,13);

        createIntegerFirstSecond.compareInteger();
        compareInteger.compareInteger();
        createIntegerFirstSecond.equalsInteger();
        compareInteger.equalsInteger();
        createIntab.compareInt();
        compareIntab1.compareInt();
        compareIntegerInt.compareIntegerInt();
        compareIntegerInt1.compareIntegerInt();
        equalsIntegerInt.equalsIntegerInt();
        equalsIntegerInt11.equalsIntegerInt();



    }
}
