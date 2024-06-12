package Part_1_IntroductionInJava.lecture_13_immutableObject.stringBufferClass;

public class ClassStringBuffer {
//    private String stringBuffer;
    public void exampleStringBuffer() {

        StringBuffer stringBuffer = new StringBuffer("stringBuffer append: ");
        stringBuffer.append("DEF").append("JKL").append("MNO");
        System.out.println(stringBuffer);
    }

//    @Override
//    public String toString() {
//        return "ClassStringBuffer{" +
//                "stringBuffer='" + stringBuffer + '\'' +
//                '}';
//    }
}
