package Part_1_IntroductionInJava.Task_12_Exemple_BookingHotel;

import Part_1_IntroductionInJava.Task_12_Exemple_BookingHotel.entity.Bill;
import Part_1_IntroductionInJava.Task_12_Exemple_BookingHotel.entity.Client;
import Part_1_IntroductionInJava.Task_12_Exemple_BookingHotel.entity.Hotel;
import Part_1_IntroductionInJava.Task_12_Exemple_BookingHotel.entity.Room;
import Part_1_IntroductionInJava.Task_12_Exemple_BookingHotel.service.BookingService;
import Part_1_IntroductionInJava.Task_12_Exemple_BookingHotel.viewerFreeRoom.ViewerFreeRoom;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Bill loriBill = new Bill(80_000);
        Bill baxBill = new Bill(60000);
//        System.out.println(loriBill.toString());
//        System.out.println(baxBill.toString());
        Client loriClient = new Client("Lori", "Cat", "1111-111-11-11", "@lori", loriBill);
        Client baxClient = new Client("Baxter", "Cat", "2-222-222-22-22", "@lori", baxBill);
//        System.out.println(loriClient.toString());
//        System.out.println(baxClient.toString());
        Room[] californiaHotelRooms =new Room[]{
                new Room(1, 10_000, true),
                new Room(11, 110_000, true),
                new Room(2, 20_000, true),
                new Room(12, 120_000, true),
                new Room(3, 30_000, true),
                new Room(13, 130_000, true),
                new Room(4, 40_000, true),
                new Room(14, 140_000, true),
                new Room(5, 50_000, true),
                new Room(15, 150_000, true),
                new Room(6, 60_000, true),
                new Room(16, 160_000, true),
                new Room(7, 70_000, true),
                new Room(17, 170_000, true),
                new Room(8, 80_000, true),
                new Room(18, 180_000, true),
                new Room(9, 90_000, true),
                new Room(19, 190_000, true),
                new Room(10, 100_000, true),
                new Room(20, 200_000, true),
        };
//        System.out.println(Arrays.toString(californiaHotelRooms));
        Hotel californiaHotel = new Hotel("California", californiaHotelRooms);
//        System.out.println(californiaHotel.toString());
//        System.out.println(californiaHotel.toString());

        Room[] hollywoodHotelRoom = new Room[]{
                new Room(21, 21_000, false),
        new Room(22, 22_000, true),
                new Room(23, 23_000,true),
                new Room(24,24_000, true),
                new Room(25,25_000,true),
        };
        Hotel hollywoodHotel = new Hotel("Hollywood", hollywoodHotelRoom);
        BookingService bookingService = new BookingService();
        bookingService.book(californiaHotel, loriClient, 1);
        System.out.println(loriClient.getBill().getAmount());
//        if (!Arrays.toString().hollywoodHotelRoom.isFree()) {
        System.out.println(Arrays.toString(californiaHotelRooms));
//        }
        System.out.println();
        bookingService.book(hollywoodHotel, baxClient, 22);
        System.out.println(baxBill.getAmount());
        System.out.println(Arrays.toString(hollywoodHotelRoom));
        System.out.println();
//        BookingService bookingService1 = new BookingService();
        bookingService.book(californiaHotel ,loriClient,2);
        System.out.println(loriBill.getAmount());
        System.out.println();
        bookingService.book(hollywoodHotel ,baxClient,20);
        System.out.println(baxBill.getAmount());
        System.out.println();
        bookingService.book(californiaHotel ,loriClient,3);
        System.out.println(loriBill.getAmount());
        System.out.println();
        bookingService.book(hollywoodHotel ,baxClient,21);
        System.out.println(baxBill.getAmount());
        ViewerFreeRoom viewerFreeRoom = new ViewerFreeRoom();
        viewerFreeRoom.viewerFreeRoom(californiaHotelRooms,californiaHotel);
        viewerFreeRoom.viewerFreeRoom(hollywoodHotelRoom,hollywoodHotel);
//        System.out.println(loriBill.toString());
//        System.out.println(baxBill.toString());
//        System.out.println(californiaHotel.toString());
//        System.out.println(californiaHotel.toString());
//        californiaHotel.toString();
//        hollywoodHotelRoom.toString();
    }
}
