package Part_1_IntroductionInJava.lecture_13_immutableObject;

import Part_1_IntroductionInJava.lecture_13_immutableObject.class_StringBuilder.BuildString;
import Part_1_IntroductionInJava.lecture_13_immutableObject.immuttable.Immuttable;
import Part_1_IntroductionInJava.lecture_13_immutableObject.methodConcat.MethodConcat;
import Part_1_IntroductionInJava.lecture_13_immutableObject.stringBufferClass.ClassStringBuffer;

public class Main {
    public static void main(String[] args) {
        String a = "ABC";
        a.concat("DFE");
        System.out.println(a);
        Immuttable immuttable = new Immuttable("ACB");
        immuttable.immutable();

        BuildString buildString = new BuildString();
        buildString.buildString();
        System.out.println(MethodConcat.methodConcat() + " - Metjhod Concat");

        ClassStringBuffer classStringBuffer = new ClassStringBuffer();
        classStringBuffer.exampleStringBuffer();
    }
}
