package Part_1_IntroductionInJava.Task_12_Try_BookingRoomInHotel.service;

import java.util.Scanner;

public class TransactionConfirmation {
    static Scanner scanner = new Scanner(System.in);
    static char confirmation;
    public static char transactionConfirmation() {  // (char confirmation) {
        System.out.print("Подтверждаете Ли Вы Снятие Денег: ");
        confirmation = scanner.next().charAt(0);
//        System.out.println("Ваш Ответ: " + confirmation);
        return confirmation;
    }
}
