package Part_1_IntroductionInJava.lecture_9_Property_OOP_Inharitance.Inharitance.SubClass;

import Part_1_IntroductionInJava.lecture_9_Property_OOP_Inharitance.Inharitance.SuperClass.Cat;

public class British extends Cat {
    private String name;
    public British(int age, String owner, String name) {
        super(age, owner);
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
//        return super.toString();
        return "Cat Name " + getName() + " Age: " + super.getAge() + " Owner " + super.getOwner();
    }
    // Проверка Содержажния Объектов "martin" и "anotherMartin" Класса British,
    //  Если Поля Равны, то Выдаст true.
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() == o.getClass()) {
            British outsideObject = (British) o;
            return name.equals(outsideObject.name)
                    && getAge() == outsideObject.getAge()
                    && getOwner().equals(outsideObject.getOwner());
        }
        return false;
    }
}
