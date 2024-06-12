package Part_1_IntroductionInJava.Task_7_Example_MinimumBankSystem.entity;

public class Deposit {
    private Bill bill;
    public Deposit(Bill bill) {
        this.bill = bill;
    }
    public Bill getBill() {
        return bill;
    }
    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
