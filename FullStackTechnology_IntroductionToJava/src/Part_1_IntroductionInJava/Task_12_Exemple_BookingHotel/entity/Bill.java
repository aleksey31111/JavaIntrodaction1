package Part_1_IntroductionInJava.Task_12_Exemple_BookingHotel.entity;

public class Bill {
    private Integer amount;
    public Bill(Integer amount) {
        this.amount = amount;
    }
    public Integer getAmount() {
        return amount;
    }
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "amount=" + amount +
                '}';
    }
}
