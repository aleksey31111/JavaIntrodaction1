package Part_1_IntroductionInJava.lecture_13_immutableObject.mySelf_immutableObject;

public class Cat {
    private final String name;
    private final Integer age;
    private final Owner owner;

    public Cat(String name, Integer age, Owner owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public Integer getAge() {
        return age;
    }

//    public void setAge(Integer age) {
//        this.age = age;
//    }

    public Owner getOwner() {
        return owner;
    }

//    public void setOwner(Owner owner) {
//        this.owner = owner;
//    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", owner=" + owner +
                '}';
    }
}
