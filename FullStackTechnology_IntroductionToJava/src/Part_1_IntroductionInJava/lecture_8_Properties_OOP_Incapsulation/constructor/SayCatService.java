package Part_1_IntroductionInJava.lecture_8_Properties_OOP_Incapsulation.constructor;

public class SayCatService {
    public static String hello = "Hello From Static!";
    public static void  sayMeow(Cat cat) {
        String catName = cat.getName();
        int catOld = cat.getAge();
        String catOwner = cat.getOwner();
        if (catName != null && catOld != 0 && catOwner != null) {
            System.out.println(cat.getName() + " Old: " + cat.getAge() + " Владелец: " + cat.getOwner() + " Say Meow!");
        }
        else if (catName != null && catOld != 0 && catOwner == null) {
            System.out.println(cat.getName() + " Old: " + cat.getAge() + " Say Meow!");
        }
        else if (catName != null && catOld == 0 && catOwner == null) {
            System.out.println(cat.getName() + " Say Meow!");
        }else {
            System.out.println("Say Hallow!");
        }
    }
    public void say(Cat cat, String message) {
        String catName = cat.getName();
        String result = catName + " : " + message;
        System.out.println(result);
        System.out.println(concatNameAndMessage(cat, " Hello"));
    }
    private String concatNameAndMessage(Cat cat, String message) {
        String catName = cat.getName();
        int catOld = cat.getAge();
        String catOwner = cat.getOwner();
        if (catName != null && catOld != 0 && catOwner != null) {
            return cat.getName() + " Old: " + cat.getAge() + " Владелец: " + cat.getOwner() + message;
        }
        else if (catName != null && catOld != 0 && catOwner == null) {
            return cat.getName() + " Old: " + cat.getAge() + message;
        }
        else if (catName != null && catOld == 0 && catOwner == null) {
            return cat.getName() + message;
        }else {
            return message;
        }

//        return name + ": " + message;
//        cat.getAge();
//        if (name == null) {  // || Cat.getAge == null ||Cat.getOwner == null){

        }
}

