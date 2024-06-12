//package Part_1_IntroductionInJava.Task_7_Try_MinimumBankSystem.Service;
//
//import Part_1_IntroductionInJava.Task_7_Try_MinimumBankSystem.module.Account;
//
//public class PaymentService {
//    public void paymentService(Account account, int amount) {
//        if (account.getBill().getNumberValue() < amount) {
//            int currentBillAccount = account.getBill().getNumberValue();
//            System.out.println("На Счету Акаунта: " + account.getPerson().getName() + " Недостаточно Средств: " + currentBillAccount + " Чтобы Оплатить Сумму: " + amount);
//        } else {
//            int currentBillAccount = account.getBill().getNumberValue();
//            System.out.println("Происходит Оплата На Сумму: " + amount + " Акаунта: " + account.getPerson().getName() + " C Текущим Счетом: " + currentBillAccount);
//            account.getBill().setNumberValue(currentBillAccount - amount);
//            System.out.println("Произошла Оплата На Сумму: " + amount + " Акаунта: " + account.getPerson().getName() + "С Оставшимися Наличными: " + account.getBill().getNumberValue());
//        }
//    }
//}
//