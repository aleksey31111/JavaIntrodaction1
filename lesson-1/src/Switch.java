import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите Возраст: ");
//        int age = scanner.nextInt();
////        if (age == 0) System.out.println("Ты родился.");
////        else if (1 <= age && age < 7) System.out.println("Ты ходиш в детский сад.");
////        else if (7 <= age && age <= 18) System.out.println("Ты Учишся В Школе.");
////        else if (age == 18) System.out.println("Ты Закончил Школу.");
////        else if (age >= 18 && age <= 60) System.out.println("Ты Работаеш.");
////        else System.out.println("Ты пенсионер");
//
//        switch (age) {
//            case 0:
//                System.out.println("Ты Родился.");
//                break;
//            case 1:
//                System.out.println("Ты ходиш в детский сад.");
//                break;
//            case 2:
//                System.out.println("Ты ходиш в детский сад.");
//                break;
//            case 3:
//                System.out.println("Ты ходиш в детский сад.");
//                break;
//            case 4:
//                System.out.println("Ты ходиш в детский сад.");
//                break;
//            case 5:
//                System.out.println("Ты ходиш в детский сад.");
//                break;
//            case 6:
//                System.out.println("Ты ходиш в детский сад.");
//                break;
//            case 7:
//                System.out.println("Ты пошел в школу.");
//                break;
//            case 18:
//                System.out.println("Ты Закончил Школу.");
//            default:
//                System.out.println("Ни одно Из Предыдущиз Условий Не Подошло.");
//        }

        String age_string = scanner.nextLine();
        switch (age_string) {
            case "ноль":
                System.out.println("Ты Родился.");
                break;
            case "один":
                System.out.println("Ты ходиш в детский сад.");
                break;
            case "два":
                System.out.println("Ты ходиш в детский сад.");
                break;
            case "три":
                System.out.println("Ты ходиш в детский сад.");
                break;
            case "четыре":
                System.out.println("Ты ходиш в детский сад.");
                break;
            case "пять":
                System.out.println("Ты ходиш в детский сад.");
                break;
            case "шесть":
                System.out.println("Ты ходиш в детский сад.");
                break;
            case "семь":
                System.out.println("Ты пошел в школу.");
                break;
            case "восемнадцать":
                System.out.println("Ты Закончил Школу.");
            default:
                System.out.println("Ни одно Из Предыдущиз Условий Не Подошло.");
        }
    }
}
