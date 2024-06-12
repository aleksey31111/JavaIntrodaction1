package Part_1_IntroductionInJava.Task_12_Exemple_BookingHotel.entity;

public class Client {
    private String name;
    private String surName;
    private String phoneNumber;
    private String emaile;
    private Bill bill;

    public Client(String name, String surName, String phoneNumber, String emaile, Bill bill) {
        this.name = name;
        this.surName = surName;
        this.phoneNumber = phoneNumber;
        this.emaile = emaile;
        this.bill = bill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmaile() {
        return emaile;
    }

    public void setEmaile(String emaile) {
        this.emaile = emaile;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emaile='" + emaile + '\'' +
                ", bill=" + bill +
                '}';
    }
}
