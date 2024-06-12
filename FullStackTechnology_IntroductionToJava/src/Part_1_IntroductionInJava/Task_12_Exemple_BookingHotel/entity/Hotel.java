package Part_1_IntroductionInJava.Task_12_Exemple_BookingHotel.entity;

import java.util.Arrays;

public class Hotel {
    private String name;
    private Room[] room;

    public Hotel(String name, Room[] room) {
        this.name = name;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room[] getRoom() {
        return room;
    }

    public void setRoom(Room[] room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", room=" + Arrays.toString(room) +
                '}';
    }
}
