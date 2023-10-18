import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        // System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        // for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            // System.out.println("i = " + i);
//        }
        final int MINIMUM_PLAYER = 2;
        final int MAXIMUM_PLAYER = 16;
        final int MINIMUM_MATCHES = 5;
        final int MAXIMUM_MATCHES = 100;
        final int MINIMUM_MATCHES_PER_ROUND = 1;
        final int MAXIMUM_MATCHES_PER_ROUND = 3;
        int countMatches, countPlayers, nowRound = 1;
        int countMatchesOut, nowTurn = 1;
        boolean gameEnd = false;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите числщ Игроков:");
//        countPlayers = scanner.nextInt();
        countPlayers = inputInt("Введите числщ Игроков: ", MINIMUM_PLAYER, MAXIMUM_PLAYER);
//        System.out.print("Введите количество спичек:");
//        countMatches = scanner.nextInt();
        System.out.println("Приветствуем Вас в игре \"Спички\" !");
        System.out.println("Количество Игроков От " + MINIMUM_PLAYER + " До " + MAXIMUM_PLAYER);
        System.out.println("Каждый игрок По очереди Вытягивает От " + MINIMUM_MATCHES_PER_ROUND + " До " +
                MAXIMUM_MATCHES_PER_ROUND + " Спичек.");
        countMatches = inputInt("Введите Количество Спичек: ", MINIMUM_MATCHES,
                MAXIMUM_MATCHES);
        while (!gameEnd) {
            System.out.println("Раунд: № " + nowRound++ + " !\n"
            + "Сейчас На Столе " + countMatches + " Спичек.") ;
            for (nowTurn =1; nowTurn <= countPlayers; nowTurn++) {
//                System.out.print("Введите количество Спичек" +
//                        "Ход Игрока № "+ nowTurn
//                        + " которое Вы Хотите Убрать!");
//                System.out.print("Ход Игрока № " + nowTurn);
//                countMatchesOut = scanner.nextInt();
                countMatchesOut = inputInt("Ход Игрока № " + nowTurn +
                        " Введите Количество Спичек, " +
                        "которое Вы бы Хотели Убрать ", MINIMUM_MATCHES_PER_ROUND, MAXIMUM_MATCHES_PER_ROUND);
                countMatches = countMatches - countMatchesOut;
                if (countMatches <= 0){
                    gameEnd = true;
                    break;
                }
            }
//            nowRound++;
        }
        System.out.println("Игра закончена! " +
                "Последнюю спичку вытащил Игрок № "
                + nowTurn);

//        String next = scanner.next();
    }

    public static int inputInt(String msg, int min, int max) {
        System.out.print(msg);
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            if (number < min || number > max) {
                System.out.println("Введенное число должно быть " +
                        "в диапазоне от " + min + " до " + max);
                System.out.println("Введите число ещё раз.");
                number = inputInt(msg, min, max);
            }
        }
        else {
            System.out.println("Вы Ввели НЕ Целое Число !");
            System.out.println("Введите Целое Число: ");
            number = inputInt(msg, min, max);
        }
        return number;
    }
}