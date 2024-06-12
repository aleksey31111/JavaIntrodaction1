package Part_1_IntroductionInJava.Task_7_BankAplicationOnJavaKlass_Person_Account__MyWayInGerman;

/**
 *  b. Создайте Класс Person со следующими Атрибутами:
 *     ( String firstName, String lastName, MyDate birthday).
 *       Напишите Методы Конструктора toString.
 */

public class Person {
    private String firstName;
    private String lastName;
    private MyDate birthday;
    public Person(String firstName, String lastName, MyDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }
//    public int getBirthday() {
//        return birthday;
//    }
    public MyDate getBirthday() {
        return birthday;
    }
    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
//    public String toString

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
