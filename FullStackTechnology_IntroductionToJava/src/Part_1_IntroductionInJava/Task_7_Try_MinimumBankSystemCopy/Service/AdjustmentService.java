//package Part_1_IntroductionInJava.Task_7_Try_MinimumBankSystem.Service;
//
//import Part_1_IntroductionInJava.Task_7_Try_MinimumBankSystem.module.Account;
//import Part_1_IntroductionInJava.Task_7_Try_MinimumBankSystem.module.Bill;
//
//public class AdjustmentService {
//    public void adjustmentService(Account account, int numberValue) {
//        int currentBillAmount = account.getBill().getNumberValue();
//        Bill bill = account.getBill();
//        if (account.getBill().getNumberValue() < numberValue) {
//            System.out.println("Недостаточно Средств, На Счету: " + currentBillAmount);
//        } else {
//            System.out.println("Происходит Пополнение Счета Акаунта: " + account.getPerson().getName() + " На Сумму " + numberValue + " C Исходным Счетом: " + currentBillAmount);
//            account.getBill().setNumberValue(currentBillAmount + numberValue);
//            System.out.println("Завершено Пополнение Счёта Акаунта: " + account.getPerson().getName() + " На Сумму " + numberValue + " C Конечным Счётом " + account.getBill().getNumberValue());
//        }

//        int currentBillAccount = bill.getNumberValue();
//        System.out.println("Происходит Пополнение Счета Акаунта: " + account.getPerson().getName() + "с Наличными: " + currentBillAccount);
//        bill.setNumberValue(currentBillAccount + numberValue);
//        System.out.println("Завершено Пополнение Счёта Акаунта: " +  account.getPerson().getName() + account.getBill().getNumberValue());

//    }
//}
