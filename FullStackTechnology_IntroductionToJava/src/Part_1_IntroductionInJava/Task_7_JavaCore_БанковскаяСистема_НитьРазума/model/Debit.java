package Part_1_IntroductionInJava.Task_7_JavaCore_БанковскаяСистема_НитьРазума.model;

/**
 * Сберегательный Счет:
 *  - Нельзя Снимать Деньги со Счета, если Баланс Меньше или Равен 0;
 *  - За Каждую Успешную Транзакцию Должны Начислятся Проценты (0.5% в Год);
 */
public class Debit extends Account {
    public static final double BONUS_PERCENT = 0.005;
     public Debit(double balance, User USER) {
        super(balance, USER);
    }

    public double getMoney(double coins) {
         if (coins <= 0) {
             throw new IllegalStateException("Снятие Должно Быть Больше Нуля.");
         }
         if (super.getBalance() < coins) {
             throw new IllegalStateException("Недостаточно Средств на Балансе.");
         }
         addBonus();
         return super.getMoney(coins);
    }
    public double putMoney(double coins) {
         if (coins <= 0) {
             throw new IllegalStateException("Пополнение Должно Быть Больше Нуля.");
         }
         addBonus();
         return super.putMoney(coins);
    }

    private void addBonus() {

        super.putMoney(super.getBalance() * BONUS_PERCENT);
    }
}
