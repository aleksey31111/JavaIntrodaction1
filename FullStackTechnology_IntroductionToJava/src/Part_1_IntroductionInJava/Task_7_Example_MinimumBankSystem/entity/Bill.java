package Part_1_IntroductionInJava.Task_7_Example_MinimumBankSystem.entity;

public class Bill {
//    private static int amount;
    private int amount;
    public Bill(int amount) {
        this.amount = amount;
    }
//    public static int getAmount() {
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "amount=" + amount +
                '}';
    }
}
