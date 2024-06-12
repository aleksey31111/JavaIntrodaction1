package Part_1_IntroductionInJava.Task_7_Example_MinimumBankSystem.service;

import Part_1_IntroductionInJava.Task_7_Example_MinimumBankSystem.entity.Account;

public class TransferService {
    public void transfer(Account accountFrom, Account accountTo, int amount) {
//        Bill billFrom = accountFrom.getBill();
//        Bill billIn = accountIn.getBill();
//        if (billFrom.getAmount() < amount) {
//            System.out.println("Недостаточно Средств На Счёте!!!");
//        } else {
//            int currentBillAmountFrom = billFrom.getAmount();
//            int currentBillAmountIm = billIn.getAmount();
//            System.out.println("Текущее Значение Счёта Перевадящего: " + currentBillAmountFrom);
//            System.out.println("Текущее Значение Счёта Получателя: " + currentBillAmountIm);
//            billFrom.setAmount(currentBillAmountFrom - amount);
//            billIn.setAmount(currentBillAmountIm + amount);
//            System.out.println("Текущее Значение Счёта Перевадящего: " + billFrom.getAmount());
//            System.out.println("Текущее Значение Счёта Получателя: " + billIn.getAmount());
//        }

        int billFromAmount = accountFrom.getBill().getAmount();
        int billToAmount = accountTo.getBill().getAmount();
        if (billFromAmount < amount) {
            System.out.println("Перевод Не Возможен, Не Хватает Средств!!!");

        } else {
            System.out.println("Происходит Перевод Средств с Аккаунта: " + accountFrom.getAccountHolder().getName() + "\n" +
                    " На Аккауте: " + accountTo.getAccountHolder().getName() + " На Сумму: " + amount);
            accountFrom.getBill().setAmount(billFromAmount - amount);
            accountTo.getBill().setAmount(billToAmount + amount);
            System.out.println("Перевод Успешно Завершён");
        }
    }
}
