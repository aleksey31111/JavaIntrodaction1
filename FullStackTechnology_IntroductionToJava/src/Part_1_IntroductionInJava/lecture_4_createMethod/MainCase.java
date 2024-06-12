package Part_1_IntroductionInJava.lecture_4_createMethod;

public class MainCase {
    public static void main(String[] args) {
        printDayOfWeer(5);
    }
    public static void printDayOfWeer(int dayNumber) {
        switch (dayNumber) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Субота");
                break;
            case 7:
                System.out.println("Воскресение");
                break;
            default: System.out.println("Вы Ввели Не Правильный День Недели.");

        }

    }
}
