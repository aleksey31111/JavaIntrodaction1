package Part_1_IntroductionInJava.lecture_10_propertyOOP_interfaces_abstractClass_Polimorfizm.Classes;

import Part_1_IntroductionInJava.lecture_10_propertyOOP_interfaces_abstractClass_Polimorfizm.Interface.Animal;

public abstract class AbstractAnimal implements Animal {
    private String name;
    private int age;
    private String owner;
    public abstract void say();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
