package Part_1_IntroductionInJava.Task_12_Exemple_BookingHotel.viewerFreeRoom;

import Part_1_IntroductionInJava.Task_12_Exemple_BookingHotel.entity.Hotel;
import Part_1_IntroductionInJava.Task_12_Exemple_BookingHotel.entity.Room;

public class ViewerFreeRoom {
    public void viewerFreeRoom(Room[] rooms, Hotel hotel) {
//        if (!room.isFree()){
//            System.out.println(room.getNumberOfPerson());
//        }
//        if (!hotel.getRoom().isFree)
        for (Room room:
             rooms) {
            if (!room.isFree()){
                System.out.println(room.toString());
                System.out.println(hotel.getName());
            }
        }
    }
}
