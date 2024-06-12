package Lesson48Enum_enumeration;

public class Test {
//    // Как раньше перечисляли Объекты:
//    // Так Делать Не Надо!!!
//    private static final int DOG = 0;
//    private static final int CAT = 1;
//    public static final int FROG =2;
//
//    public static void main(String[] args) {
//        int animal = DOG;
//
//        switch (animal) {
//            case DOG:
//                System.out.println("It is Dog.");
//                break;
//            case FROG:
//                System.out.println("It is Frog.");
//                break;
//            default:
//                System.out.println("It's not an animal.");
//        }
//    }

    public static void main(String[] args) {
        Animal animal = Animal.CAT;
        System.out.println(animal.getTranslation());
        System.out.println(animal);  //  .toString()
        switch (animal) {
            case CAT:
                System.out.println("It is a Cat." + animal.getTranslation());
                break;
            case DOG:
                System.out.println("It is a Dog." + animal.getTranslation());
                break;
            case FROG:
                System.out.println("It is a Frog." + animal.getTranslation());
            default:
                System.out.println("It is Not an Animal.");
        }

        Season season = Season.SUMMER;
        System.out.println(season.getTemperature());
        switch (season) {
            case SUMMER:
                System.out.println("It is Summer.");
                break;
            case AUTUMN:
                System.out.println("It is Autumn.");
                break;
            case WINTER:
                System.out.println("It is Winter.");
                break;
            case SPRING:
                System.out.println("It is Spring.");
                break;
            default:
                System.out.println("It is a non Season.");
        }
        // Object -> Enum -> Season
        System.out.println(season instanceof Enum);  //Season, Object Является ли родителем season
        System.out.println(season.getClass());  // Получаем Класс Объекта season

        // Полезные Методы Enum
        System.out.println("Полезные Методы Enum");
        Season seasonUM = Season.AUTUMN;
        System.out.println(seasonUM.name());
        Animal animalN = Animal.DOG;
        System.out.println(animalN.name());
        Animal animalS = Animal.valueOf("DOG");
        System.out.println(animalS);
        System.out.println(animalS.getTranslation());
        Season winter = Season.WINTER;
        System.out.println(winter.ordinal());
    }
}
