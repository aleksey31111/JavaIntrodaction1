package Part_1_IntroductionInJava.Task_7_JavaCore_БанковскаяСистема_НитьРазума.model;

/**
 * Счет Кредитной Карты:
 *  - Максимальный баланс на Счете Составляет 100% От Кредитного Лимита.
 *  - Можно Использовать Деньги с Кредитного Лимита, Но Сумма Не Должна Превышать Доступный Лимит.
 */
public class Credit extends Account {
    private final double CREDIT_LIMIT;
    public Credit(double CREDIT_LIMIT, User user) {
        super(CREDIT_LIMIT, user);
        this.CREDIT_LIMIT = CREDIT_LIMIT;
    }

    /**
     * Получить Деньги С Лимита.
     */
    public double getMoney(double coins) {
        if (coins <= 0) {
            throw new IllegalStateException("Снятие Должно Быть Больше Нуля.");
        }
//        if (coins > CREDIT_LIMIT && coins > super.getBalance()) {
        if (coins > super.getBalance()) {  // > CREDIT_LIMIT) {
            throw new IllegalStateException("Превышен Кредитный Лимит. Можно Получить не Более " +
                    super.getBalance());
        }
//        addBonus();
        return  super.getMoney(coins);
    }

    /**
     * Пополнение Счета.
     */
    public double putMoney(double coins) {
        if (coins <= 0) {
            throw new IllegalStateException("Пополнение Должно Быть Больше Нуля.");
        }
        if (coins + super.getBalance() > CREDIT_LIMIT) {
            throw new IllegalStateException("Баланс Не Должен Превышать Кредитный Лимит.\n" +
                    "Пополнить Можно На: " + (CREDIT_LIMIT - super.getBalance()));
        }
//        addBonus();
        return super.putMoney(coins);
    }
//    private void addBonus() { addMoney(super.getBalance()) * BONUS_PERCENT}
}
