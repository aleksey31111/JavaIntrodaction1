package Part_1_IntroductionInJava.lecture_8_Properties_OOP_Incapsulation.constructor;

public class Cat {
    private String name;
    private  int age;
    private String owner;
    public Cat(){}
    public Cat(String name) { this.name = name; }
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Cat(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) {this.age = age; }
    public String getOwner() { return owner; }
    public void setOwner(String owner) { this.owner = owner; }
}
