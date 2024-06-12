package Part_1_IntroductionInJava.lecture_9_Property_OOP_Inharitance.Inharitance.SuperClass;

public class Cat {
    private int age;
    private String owner;
    public Cat(int age, String owner) {
        this.age = age;
        this.owner = owner;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

    // private, package, protected - Не Подходит, т.к. British и Scottish Не Видят .SayMeow()".
    //      так как private - Внутри Класса.
    //      package - Внутри Пакета.
    //      protected - Внутри Пакета.
    public void sayMeow() {
        System.out.println("Meow!!!Meow!!! Meow!!!");
    }
}
