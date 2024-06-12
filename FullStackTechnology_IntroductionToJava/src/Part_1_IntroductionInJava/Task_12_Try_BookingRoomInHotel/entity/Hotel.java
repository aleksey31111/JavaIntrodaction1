package Part_1_IntroductionInJava.Task_12_Try_BookingRoomInHotel.entity;

/**
 * 1.2-Hotel будет содеражть поля:
 *     1.2.a-имя отеля,
 *     1.2.b-список номеров
 */
public class Hotel {
    private String title;
    Room[] room;

    public Hotel(String title, Room[] room) {
        this.title = title;
        this.room = room;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
                "title='" + title + '\'' +
                ", room=" + room +
                '}';
    }

}
