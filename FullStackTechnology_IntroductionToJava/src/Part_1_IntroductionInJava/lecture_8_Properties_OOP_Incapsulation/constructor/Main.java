package Part_1_IntroductionInJava.lecture_8_Properties_OOP_Incapsulation.constructor;

public class Main {
    public static void main(String[] args)
    {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat("Tuzik");
        Cat cat3 = new Cat("Bobik", 13);
        Cat cat4 = new Cat("Tishka", 14);
        Cat cat5 = new Cat("Bagira", 15, "Ирина");
        System.out.println();

        System.out.println(cat1.getName() + ' ' + cat1.getAge() + ' ' + cat1.getOwner());
        System.out.println(cat2.getName() + ' ' + cat2.getAge() + ' ' + cat2.getOwner());
        System.out.println(cat3.getName() + ' ' + cat3.getAge() + ' ' + cat3.getOwner());
        System.out.println(cat4.getName() + ' ' + cat4.getAge() + ' ' + cat4.getOwner());
        System.out.println(cat5.getName() + ' ' + cat5.getAge() + ' ' + cat5.getOwner());
        System.out.println();

        SayCatService sayCatService = new SayCatService();
        sayCatService.say(cat1, ", Hello 1");
        sayCatService.say(cat2, ", New Hello 2");
        sayCatService.say(cat3, "New new Hello 3");
        sayCatService.say(cat4, "New new new Hello 4");
        sayCatService.say(cat5, "New new new new Hello 5");
        System.out.println();

        SayCatService.sayMeow(cat5);
        SayCatService.sayMeow(cat1);
        SayCatService.sayMeow(cat2);
        SayCatService.sayMeow(cat3);
        SayCatService.sayMeow(cat4);
        System.out.println();

        System.out.println(SayCatService.hello);
    }

}
