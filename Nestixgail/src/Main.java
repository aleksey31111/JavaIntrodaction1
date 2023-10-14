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
        int countMatches, countPlayers, nowRound = 1;
        int countMatchesOut, nowTurn = 1;
        boolean gameEnd = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите числщ Игроков:");
        countPlayers = scanner.nextInt();
        System.out.print("Введите количество спичек:");
        countMatches = scanner.nextInt();
        while (!gameEnd) {
            System.out.println("Раунд: №" + nowRound + " !\n"
            + "Сейчас На Столе " + countMatches + " Спичек.") ;
            for (nowTurn =1; nowTurn <= countPlayers; nowTurn++) {
                System.out.print("Введите количество Спичек" +
                        "Ход Игрока № "+ nowTurn
                        + " которое Вы Хотите Убрать!");
                countMatchesOut = scanner.nextInt();
                countMatches = countMatches - countMatchesOut;
                if (countMatches <= 0){
                    gameEnd = true;
                    break;
                }
            }
            System.out.println("Игра закончена! " +
                    "Последнюю спичку вытащил Игрок №"
            + nowTurn);
        }

//        String next = scanner.next();
    }
}