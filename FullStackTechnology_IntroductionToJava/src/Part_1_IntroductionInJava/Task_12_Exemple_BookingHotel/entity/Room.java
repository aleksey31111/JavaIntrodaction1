package Part_1_IntroductionInJava.Task_12_Exemple_BookingHotel.entity;

public class Room {
    private int numberOfPerson;
    private  int cost;
    private boolean free;
    public Room(int numberOfPerson, int cost, boolean free) {
        this.numberOfPerson = numberOfPerson;
        this.cost = cost;
        this.free = free;
    }
    public int getNumberOfPerson() {
        return numberOfPerson;
    }
    public void setNumberOfPerson(int numberOfPerson) {
        this.numberOfPerson = numberOfPerson;
    }
    public int getCost() {
        return  cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
//
//    public boolean isFree() {
//        return isFree();
//    }
//    public void setFree(boolean free) {
//        this.free = free;
//    }


    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    @Override
    public String toString() {
        return "Room{" +
                "numberOfPerson=" + numberOfPerson +
                ", cost=" + cost +
                ", free=" + free +
                '}';
    }
}
