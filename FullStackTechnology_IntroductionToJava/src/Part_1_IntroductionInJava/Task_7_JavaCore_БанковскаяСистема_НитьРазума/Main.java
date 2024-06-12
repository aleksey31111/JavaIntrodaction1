package Part_1_IntroductionInJava.Task_7_JavaCore_БанковскаяСистема_НитьРазума;

import Part_1_IntroductionInJava.Task_7_JavaCore_БанковскаяСистема_НитьРазума.model.Credit;
import Part_1_IntroductionInJava.Task_7_JavaCore_БанковскаяСистема_НитьРазума.model.Debit;
import Part_1_IntroductionInJava.Task_7_JavaCore_БанковскаяСистема_НитьРазума.model.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("Иван", 10);
        System.out.println("Пользователь: " + user);
        // Создаём Первый Тип Castomer
        Debit debit = new Debit(1_000_000, user);
        System.out.println("debit = " + debit);
        debit.putMoney(100);
        System.out.println("debit = " + debit);
        debit.getMoney(200);
        System.out.println("debit = " + debit);
//        System.out.println("bonus = " + debit.addMoney());
        Credit credit = new Credit(1000, user);
        System.out.println("Credit = " + credit);

        credit.getMoney(333);
        System.out.println("Credit = " + credit);

        credit.putMoney(3);
        System.out.println("Credit = " + credit);

        System.out.println("credit.getBalance() = " + credit.getBalance());

        try {
            credit.putMoney(2000);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            credit.getMoney(2000);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }
}
