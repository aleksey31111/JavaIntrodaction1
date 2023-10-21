import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        String s1 = new String("hheellooww..");
        Scanner s2 = new Scanner(System.in);
        System.out.print("Введите что-нибудь(строку): ");
        String string = s2.nextLine();
        System.out.println("Вы Ввели Строку: " + string);
//        Scanner s3 = new Scanner(System.in);
        System.out.print("Введите Число: ");
        int x = s2.nextInt();
        System.out.println("Вы Ввели Число: " + x);
    }
}
