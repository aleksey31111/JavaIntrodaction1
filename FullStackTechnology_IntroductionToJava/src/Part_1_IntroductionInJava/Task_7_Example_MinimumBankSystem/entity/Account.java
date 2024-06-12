package Part_1_IntroductionInJava.Task_7_Example_MinimumBankSystem.entity;

public class Account {
//    private static Person accountHolder;
    private Person accountHolder;
    private Bill bill;
    public Account(Person accountHolder, Bill bill) {
        this.accountHolder = accountHolder;
        this.bill = bill;
    }
//    public static Person getAccountHolder() {
    public Person getAccountHolder() {
        return accountHolder;
    }
    public void setAccountHolder(Person accountHolder) {
        this.accountHolder = accountHolder;
    }
    public Bill getBill() {
        return bill;
    }
    public void setBill(Bill bill){
        this.bill = bill;
    }

    @Override
    public String toString() {
        return "Account{\n" +
                "accountHolder=" + accountHolder +
                ",\n bill=" + bill +
                '}';
    }
}
