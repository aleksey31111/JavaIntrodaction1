package Part_1_IntroductionInJava.Task_12_Try_BookingRoomInHotel;

import Part_1_IntroductionInJava.Task_12_Try_BookingRoomInHotel.entity.Bill;
import Part_1_IntroductionInJava.Task_12_Try_BookingRoomInHotel.entity.Client;
import Part_1_IntroductionInJava.Task_12_Try_BookingRoomInHotel.entity.Hotel;
import Part_1_IntroductionInJava.Task_12_Try_BookingRoomInHotel.entity.Room;
import Part_1_IntroductionInJava.Task_12_Try_BookingRoomInHotel.service.Book;

public class Main {
    public static void main(String[] args) {
        Bill amount1 = new Bill(6_000);
        Client client1 = new Client("Manky", "Mankiman", "1-111-111-11-11", "mankiman@client.com", amount1);

        Bill amount2 = new Bill(100_000);
        Client client2 = new Client("Dog", "Dogman", "2-222-222-22-22", "mankiman@client.com", amount2);

        Room[] kamaHotelRoom = new Room[] {
            new Room(1, 3_000, true),
            new Room(1, 3_100, true),
            new Room(2, 6_000, true),
            new Room(5, 14_000, true),
            new Room(10, 28_000, true),
            new Room(12, 30_000, true),
        };
        Hotel kamaHotel = new Hotel("Kama", kamaHotelRoom);
        Room[] paradiseHotelRooms = new Room[]{
                new Room(1,2_999, true),
                new Room(2, 5_900,true),
                new Room(2, 5_500, true),
                new Room(3, 8_555, true),
                new Room(3, 8_500, true),
                new Room(3, 8_500, true),
                new Room(3, 8_500, true),
                new Room(4, 12_500, true),
                new Room(4, 12_500, true),
                new Room(4, 12_500, true),
                new Room(5, 14_500, true),
                new Room(5, 14_500, true),
                new Room(5, 14_500, true),
                new Room(6, 17_777, true),
                new Room(6, 17_777, true),
                new Room(6, 17_777, true),
                new Room(7, 23_777, true),
                new Room(7, 23_777, true),
                new Room(8, 25_555, true),
                new Room(8, 25_555, true),
                new Room(9, 29_555, true),

        };
        Hotel paradiseHotel = new Hotel("Paridise", paradiseHotelRooms);
//        Hotel hotel12 = new Hotel("California", room2);
//        Hotel hotel13 = new Hotel("California", room5);
//        Hotel hotel14 = new Hotel("California", room10);
//        Hotel hotel15 = new Hotel("California", room12);

//        Hotel hotel2 = new Hotel("Canifol", room2);
//        Hotel hotel3 = new Hotel("Hollywood", room1);
//        Hotel hotel4 = new Hotel("Bull", room1);
//        Hotel hotel5 = new Hotel("Fox", room1);

        System.out.println(client1.getName());
        Book book = new Book();
        book.booking(kamaHotel, client1,1);
        book.booking(paradiseHotel, client2,1);
        book.booking(paradiseHotel, client2,2);
        book.booking(paradiseHotel, client2,3);
        book.booking(paradiseHotel, client2,4);

//        book.booking(client1, kamaHotel, 1, 600_000);
//        System.out.println(client1.getName()+" "+hotel1.getTitle()+" "
//                +hotel1.getRoom().getPersonNumberOfRoom()+" "+hotel1.getRoom().getCost());
//        System.out.println(client1.toString());

    }
}
