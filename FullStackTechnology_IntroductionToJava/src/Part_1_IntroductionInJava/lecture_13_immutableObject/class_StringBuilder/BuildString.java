package Part_1_IntroductionInJava.lecture_13_immutableObject.class_StringBuilder;

public class BuildString {
    public void buildString() {
        StringBuilder stringBuilder = new StringBuilder("ABC");
        stringBuilder.append("DEF").append("GHI").append("JKL");
        String n = stringBuilder.toString();
        System.out.println(stringBuilder + " - StringBiolder");
        System.out.println(n + " - StringBiulder");
    }
}
