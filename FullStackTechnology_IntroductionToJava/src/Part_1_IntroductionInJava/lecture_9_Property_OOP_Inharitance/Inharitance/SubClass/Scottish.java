package Part_1_IntroductionInJava.lecture_9_Property_OOP_Inharitance.Inharitance.SubClass;

import Part_1_IntroductionInJava.lecture_9_Property_OOP_Inharitance.Inharitance.SuperClass.Cat;

public class Scottish extends Cat {
    private String name;
    public Scottish(int age, String owner, String name) {
        super(age, owner);
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
//        return "Scottish{" +
//                "name='" + name + '\'' +
//                '}';
        return "Cat Name " + getName() + " Age: " + getAge() + " Owner " + getOwner();
    }
}
