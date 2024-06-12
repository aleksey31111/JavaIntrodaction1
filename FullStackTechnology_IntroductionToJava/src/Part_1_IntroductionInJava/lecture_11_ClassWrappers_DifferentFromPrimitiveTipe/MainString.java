package Part_1_IntroductionInJava.lecture_11_ClassWrappers_DifferentFromPrimitiveTipe;

import Part_1_IntroductionInJava.lecture_11_ClassWrappers_DifferentFromPrimitiveTipe.CreateString.CreateString;

//import CreateString;
public class MainString {
    public static void main(String[] args) {
        CreateString createString = new  CreateString("ABC", "ABC", "ABC", "ABC");
        createString.compareString13();
        createString.equalsString13();
        createString.compareString12();
        createString.compareString14intern();
        createString.toString();
    }
}
