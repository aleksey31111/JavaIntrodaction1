import Lesson28Packet1.Person;
public class Lesson28ModificatorAccess extends Person {
    public int id;
    private int id1;
    int id3; // default
    protected int id4;
//    public static void main(String[] args) {
        // public, private, default, protected
//        Person person1 = new Person();
//        person1.name = "Bob";
//        System.out.println(Person.CONSTANT);
//        Person p1 = new Person();
//        System.out.println(p1.name);
//    }
    public Lesson28ModificatorAccess(){
        name = "Tom";
    }
    private void technicalMethod(){

    }
}
