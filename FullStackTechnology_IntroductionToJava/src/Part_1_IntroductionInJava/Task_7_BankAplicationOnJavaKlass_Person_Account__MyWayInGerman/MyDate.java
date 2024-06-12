package Part_1_IntroductionInJava.Task_7_BankAplicationOnJavaKlass_Person_Account__MyWayInGerman;


/**
 * a.   Создайте Класс MyDate со следующими Атрибутами:
 *      ( imt day, int month, int year).
 *        Напишите Метод Конструктор и toString.
 */
public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
//    public int getDay() {
//        return day;
//    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    @Override
    public String toString() {
        return "MyData{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
