package Part_1_IntroductionInJava.Task_7_Example_MinimumBankSystem.service;

import Part_1_IntroductionInJava.Task_7_Example_MinimumBankSystem.entity.Account;
import Part_1_IntroductionInJava.Task_7_Example_MinimumBankSystem.entity.Bill;

public class DepositService {
    public void deposit(Account account, int amount) {
        Bill bill = account.getBill();
        int currentBillAccount = bill.getAmount();
        System.out.println("Операция Пополнения Счета, текущее Значение: " + currentBillAccount);
        bill.setAmount(currentBillAccount + amount);
        System.out.println("Пополнение Счета Прошло Успешно, новое Знечение Счёта: " + bill.getAmount());

    }
}
