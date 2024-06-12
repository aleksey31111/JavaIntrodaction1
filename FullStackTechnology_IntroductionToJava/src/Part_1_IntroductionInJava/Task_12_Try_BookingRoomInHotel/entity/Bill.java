package Part_1_IntroductionInJava.Task_12_Try_BookingRoomInHotel.entity;

/**
 * 1.4-В Bill будет
 *    1.4.a-сумма денег
 */
public class Bill {
    private int amount;
//    Client client;

    public Bill(int amount) {  // , Client client) {
        this.amount = amount;
//        this.client = client;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
//    public Client getClient() {
//        return client;
//    }
//    public void  setClient(Client client) {
//        this.client = client;
//    }

    @Override
    public String toString() {
        return "Bill{" +
                "amount=" + amount +
//                "client=" + client +
                '}';
    }
}
