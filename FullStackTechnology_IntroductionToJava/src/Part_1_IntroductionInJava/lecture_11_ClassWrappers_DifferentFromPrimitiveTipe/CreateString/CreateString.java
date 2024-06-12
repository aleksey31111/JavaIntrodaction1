package Part_1_IntroductionInJava.lecture_11_ClassWrappers_DifferentFromPrimitiveTipe.CreateString;

public class CreateString {
    private String firstString = "ABC";
    private String secondString = "ABC";
    private String thirdString = new String("ABC");
    private String fourthString = new String("ABC").intern();
    public CreateString (String firstString, String secondString, String thirdString, String fourthString) {
        this.firstString = firstString;
        this.secondString = secondString;
        this.thirdString = thirdString;
        this.fourthString = fourthString;
    }
    public String getFirstString() {
        return firstString;
    }

    public void setFirstString(String firstString) {
        this.firstString = firstString;
    }

    public String getSecondString() {
        return secondString;
    }

    public void setSecondString(String secondString) {
        this.secondString = secondString;
    }

    public String getThirdString() {
        return thirdString;
    }

    public void setThirdString(String thirdString) {
        this.thirdString = thirdString;
    }

    public String getFourthString() {
        return fourthString;
    }

    public void setFourthString(String fourthString) {
        this.fourthString = fourthString;
    }

    public void compareString13() {
        boolean compare13String = firstString == thirdString;
        System.out.println("firstString: " + firstString
                + " == " + "thirdString: " + thirdString
                + " = " + compare13String);
//        return compare13String;
    }
    public void compareString14intern() {
        boolean compare14StringIntern = firstString == secondString;
        System.out.println("firstString: " + firstString
                + " == " + "fourthString: " + fourthString
                + " = " + compare14StringIntern);
    }
    public void compareString12() {
        boolean compare12String = firstString == secondString;
        System.out.println("firstString: " + firstString
                + " == " + "secondString: " + secondString
                + " = " + compare12String);
    }
    public void equalsString13() {
        boolean equals13String = firstString.equals(thirdString);
        System.out.println("firstString: " + firstString + ".equals("
                + "thirdString: " + thirdString +" = " + equals13String);
    }

    @Override
    public String toString() {
        return "CreateString{" +
                "firstString='" + firstString + '\'' +
                ", secondString='" + secondString + '\'' +
                ", thirdString='" + thirdString + '\'' +
                ", fourthString='" + fourthString + '\'' +
                '}';
    }
}
