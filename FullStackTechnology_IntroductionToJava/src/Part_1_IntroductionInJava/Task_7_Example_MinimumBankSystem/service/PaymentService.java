package Part_1_IntroductionInJava.Task_7_Example_MinimumBankSystem.service;

import Part_1_IntroductionInJava.Task_7_Example_MinimumBankSystem.entity.Account;
import Part_1_IntroductionInJava.Task_7_Example_MinimumBankSystem.entity.Bill;

public class PaymentService {
    public void pay(Account account, int amount) {
        Bill bill = account.getBill();
        if (bill.getAmount() < amount) {
            System.out.println("Платёж Не Возможен. Недостаточно Средств.");
        }else {
            int currentBillAmount = bill.getAmount();
            System.out.println("Происходит Операция Платежа, Текущее Значение Счета: " + currentBillAmount);
            bill.setAmount(currentBillAmount - amount);
            System.out.println("Платёж Завершен, Новое Значение Счета: " + bill.getAmount());
        }
    }
}
