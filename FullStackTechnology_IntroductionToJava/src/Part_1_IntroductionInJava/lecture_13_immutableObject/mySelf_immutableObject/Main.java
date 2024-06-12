package Part_1_IntroductionInJava.lecture_13_immutableObject.mySelf_immutableObject;

public class Main {
    public static void main(String[] args) {
        Owner alex = new Owner("Alex");
        Cat lori = new Cat("Lori", 4, alex);
        System.out.println(lori.toString());
//        lori.setAge(10);
        System.out.println(lori.toString());
//        lori.getOwner().setName("Jeff");
        System.out.println(lori.toString());
    }
}
