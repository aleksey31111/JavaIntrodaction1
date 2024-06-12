package Part_1_IntroductionInJava.lecture_13_immutableObject.immuttable;

public class Immuttable {
    private String a = "ABC";

    public Immuttable(String a) {
        this.a = a;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Immuttable{" +
                "a='" + a + '\'' +
                '}';
    }
    public void immutable() {
        System.out.println(a.concat("DFE"));
        String b = a.concat("ACB");
        System.out.println(a);
        System.out.println(b);
    }
}
