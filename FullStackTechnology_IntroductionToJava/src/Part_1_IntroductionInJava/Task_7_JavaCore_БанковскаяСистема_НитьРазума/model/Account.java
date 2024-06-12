package Part_1_IntroductionInJava.Task_7_JavaCore_БанковскаяСистема_НитьРазума.model;

import java.text.DecimalFormat;
import java.util.UUID;

/**
 * Создать Родительский Класс Account.
 * Со Следующими Атрибутами:
 * - номер счета;
 * - баланс;
 * - владелец счета;
 * <p>
 * Реализовать методы для каждого Родительского Класса для:
 *      - Пополнения Счета на Указанную Сумму;
 *      - Снятие Указанной суммы со счета;
 *      - Запрос Баланса;
 * </p>
 */

public abstract class Account {
    private final String ACCOUNT_NUMBER;
    private double balance;
    private final User USER;

    public Account(/*String ACCOUNT_NUMBER,*/double balance, User USER) {
        this.ACCOUNT_NUMBER = UUID.randomUUID().toString();
        this.balance = balance;
        this.USER = USER;
    }

    /**
     * Пополнение Счета На Указанную Сумму.
     */
    public double putMoney(double coins) {
        balance += coins;
        return balance;
    }

    /**
     * Снятие Со Счета На Указанную Сумму.
     *
     */
    public double getMoney(double coins) {
        balance -= coins;
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getACCOUNT_NUMBER() {
        return ACCOUNT_NUMBER;
    }

    public User getUSER() {
        return USER;
    }

    @Override
    public String toString() {
        return "Account{" +
                "ACCOUNT_NUMBER='" + ACCOUNT_NUMBER + '\n' +
                ", balance=" + new DecimalFormat("###,###.##").format(balance) + '\n'
                + ", USER=" + USER +
                '}';
    }
}
