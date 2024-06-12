package Part_1_IntroductionInJava.Task_12_Try_BookingRoomInHotel.entity;

/**
 * 1.3-Room будет содеражть
 *      1.3.a-колличество человек, которых     можно разместить,
 *      1.3.b-стоимость этого номера и
 *      1.3.c-свободен ли этот номер
 */
public class Room {
    private int personNumberOfRoom;
    private int cost;
//    private String comfort;
    private boolean free;  // =false;

    public Room(int personNumberOfRoom, int cost, boolean free) {
        this.personNumberOfRoom = personNumberOfRoom;
        this.cost = cost;
        this.free = free;
    }

    public int getPersonNumberOfRoom() {
        return personNumberOfRoom;
    }

    public void setPersonNumberOfRoom(int personNumberOfRoom) {
        this.personNumberOfRoom = personNumberOfRoom;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    @Override
    public String toString() {
        return "Room{" +
                "personNumberOfRoom=" + personNumberOfRoom +
                ", cost=" + cost +
                ", free=" + free +
                '}';
    }
}
