package Part_1_IntroductionInJava.Task_7_BankAplicationOnJavaKlass_Person_Account__MyWayInGerman;

/**
 * Создайте Класс Account со следующими Атрибутами:
 *  String IBAN (номер Счёта),
 *  Person owner (владелец),
 *  double balance (баланс),
 *  MyDate dayOpen (дата Открытия).
 * Напишите Метод Конструктор и toString
 */
public class Account {
    private String IBAN;
    private Person owner;
    private double balance;
    private MyDate dayOpen;
    public Account(String IBAN, Person owner, double balance, MyDate dayOpen) {
        this.IBAN = IBAN;
        this.owner = owner;
        this.balance = balance;
        this.dayOpen = dayOpen;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public MyDate getDayOpen() {
        return dayOpen;
    }

    public void setDayOpen(MyDate dayOpen) {
        this.dayOpen = dayOpen;
    }

    @Override
    public String toString() {
        return "Account{" +
                "IBAN='" + IBAN + '\'' +
                "balance= " + balance + '\'' +
                ", owner=" + owner +
                ", dayOpen=" + dayOpen +
                '}';
    }
}
