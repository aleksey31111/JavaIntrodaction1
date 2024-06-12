package Part_1_IntroductionInJava.Task_7_Try_MinimumBankSystemCopy.module;

/**
 * Класс Person будет иметь следующие поля:
 *      имя;
 *      фамилия;
 *      номер телефона;
 */
public class Person {
    private String name;
    private String surname;
    private String telephon;

    public Person(String name, String surname, String telephon) {
        this.name = name;
        this.surname = surname;
        this.telephon = telephon;
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

    public String getTelephon() {
        return telephon;
    }

    public void setTelephon(String telephon) {
        this.telephon = telephon;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", telephon='" + telephon + '\'' +
                '}';
    }
}
