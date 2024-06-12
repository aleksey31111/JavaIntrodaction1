package Part_1_IntroductionInJava.Task_12_Try_BookingRoomInHotel.entity;

/**
 * 1.1-
 * Client будет содержать поля:
 *   1.1.a-имя,
 *   1.2.b-фамилию,
 *   1.3.c-номер телефона,
 *   1.4.d-почту,
 *   1.5.f-ссылку на Bill
 */
public class Client {
    private String name;
    private String surname;
    private String phone;
    private String email;
    Bill bill;

    public Client(String name, String surname, String phone, String email, Bill bill) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.bill = bill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", bill=" + bill +
                '}';
    }
}
