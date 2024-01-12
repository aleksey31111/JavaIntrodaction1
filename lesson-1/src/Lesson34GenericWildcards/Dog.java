package Lesson34GenericWildcards;

public class Dog extends Animal{
    private int id;
    public Dog() {

    }
    public Dog(int id) {
        this.id = id;
    }
//    public void eat() {
//        System.out.println("Dog is Eating...");
//    }
    public String toString() {
        return String.valueOf(id);
    }


}
