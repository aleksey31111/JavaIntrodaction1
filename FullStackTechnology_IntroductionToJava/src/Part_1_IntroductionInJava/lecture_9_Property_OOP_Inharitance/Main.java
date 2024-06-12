package Part_1_IntroductionInJava.lecture_9_Property_OOP_Inharitance;

import Part_1_IntroductionInJava.lecture_9_Property_OOP_Inharitance.Inharitance.SuperClass.Cat;
import Part_1_IntroductionInJava.lecture_9_Property_OOP_Inharitance.Inharitance.SubClass.British;
import Part_1_IntroductionInJava.lecture_9_Property_OOP_Inharitance.Inharitance.SubClass.Scottish;

public class Main {
    public static void main(String[] args) {
        British catBritish = new British(4, "Alex", "Lory");
        Scottish catScottish = new Scottish(10, "Angre", "Baxter");
//        System.out.println("catBritish, catScottish: sayMeow");
//        catBritish.sayMeow();
//        catScottish.sayMeow();
//        System.out.println();
        // Создаём Объекты:
        //      Дочерних Классов Наследуемых British и Scottish
        //          от СуперКласса Cat.
        Cat loriCat = new British(11, "Alexy", "Loriana");
        Cat bartCat = new Scottish(13, "Andrewa", "Baxtery");
//        System.out.println("loryCat, bartCat: sayMeow");
//        loriCat.sayMeow();
//        bartCat.sayMeow();
//        System.out.println();

//        System.out.println("catBritish, catScottish: private String name" );
//        System.out.println("Cat Name " + catBritish.getName() + " Age: " + catBritish.getAge() + " Owner " + catBritish.getOwner());
//        System.out.println("Cat Name " + catScottish.getName() + " Age: " + catScottish.getAge() + " Owner " + catScottish.getOwner());
//        System.out.println();

//        System.out.println("loriCat, bartCat");
//        System.out.println("Owner " + loriCat.getOwner() + " Age: " + loriCat.getAge());
//        System.out.println("Oener " + bartCat.getOwner() + " Age: " + bartCat.getAge());
//        System.out.println();

        System.out.println("catBritish, catScottish: toString");
        System.out.println(catBritish.toString());
        System.out.println(catScottish.toString());
        System.out.println();

        System.out.println("loryCat, bartCat: toString");
        System.out.println(loriCat.toString());
        System.out.println(bartCat.toString());
        System.out.println();

        System.out.println("Сравнивание Объекта Друг с Другом:");
        British martin = new British(4, "Alex", "Martin");
        British anotherMartin = new British(4,"Alex", "Martin");
        System.out.println("Ссылки Не Будут Равны Между Собой:");
        System.out.println(martin == anotherMartin);
        System.out.println(martin.equals(anotherMartin));

    }
}
