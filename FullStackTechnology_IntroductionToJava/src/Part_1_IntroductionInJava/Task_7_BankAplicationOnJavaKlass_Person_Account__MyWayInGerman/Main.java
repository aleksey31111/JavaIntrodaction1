package Part_1_IntroductionInJava.Task_7_BankAplicationOnJavaKlass_Person_Account__MyWayInGerman;

/**
 * Создайте Несколько Счетов;
 * Создайте Массив Из Счетов;
 * Распечатайте Список Счетов;
 */
public class Main {
    public static void main (String[] args) {
        MyDate stirlizBirth = new MyDate(5, 5, 1905);
        Person shtirliz = new Person("Sergey", "Shtirliz", stirlizBirth);
        MyDate open1 = new MyDate(1,1,1939);
        Account account1 = new Account("DE123456789", shtirliz, 200_000.0, open1);

        MyDate mullerBirth = new MyDate(6,6,1906);
        Person muller = new Person("Henrizh", "Muller", mullerBirth);
        MyDate open2 = new MyDate(2,2, 1940);
        Account account2 = new Account("DE234567891", muller, 200_000, open2);

        MyDate schelenbergBirth = new MyDate(7,7,1907);
        Person schelenberg = new Person("Walter", "Schelenberg", open2);
        MyDate open3 = new MyDate(3,3,1941);
        Account account3 = new Account("DE345678912", schelenberg, 300_000,open3);

        Account[] accounts = {account1, account2, account3};
        System.out.println(accounts);
        print(accounts);
    }
    public static void printRevers(Account[] array) {
        for (int i = array.length-1; i >= 0; i--) {
            System.out.println(i + ":" + array[i] + ";");
        }
    }
    public static void print(Account[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " : " + array[i] + ";");
        }
    }
}
