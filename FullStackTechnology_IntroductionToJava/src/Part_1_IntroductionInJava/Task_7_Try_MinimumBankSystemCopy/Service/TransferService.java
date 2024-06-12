//package Part_1_IntroductionInJava.Task_7_Try_MinimumBankSystem.Service;

//import Part_1_IntroductionInJava.Task_7_Try_MinimumBankSystem.module.Account;

//public class TransferService {
//    public void transferService(Account accountFrom, Account accountTo, int amount) {
//        if (accountFrom.getBill().getNumberValue() < amount) {
//            System.out.println("Не Достаточно Средств: " + accountFrom.getBill().getNumberValue() + " На Акаунте: " + accountFrom.getPerson().getName() + " чтобы Оплатить: " + amount);
//        } else {
//            int currentBillAccountFrom = accountFrom.getBill().getNumberValue();
//            int currentBillAccountTo = accountTo.getBill().getNumberValue();
//            System.out.println("Происходит Перевод Денежных Средств: " + amount + " С Акаунта " + accountFrom.getPerson().getName() + " Со Счета " + currentBillAccountFrom +
//                    "\nНа Акаунт: " +accountTo.getPerson().getName() + " На Счёт: " + currentBillAccountTo);
//            accountFrom.getBill().setNumberValue(currentBillAccountFrom - amount);
//            accountTo.getBill().setNumberValue(currentBillAccountTo + amount);
//            System.out.println("Завершен Перевод Денежных Средств: " + amount + " С Акаунта " + accountFrom.getPerson().getName() + " Остатки Счета Платящего  " + accountFrom.getBill().getNumberValue() +
//                    "\n На Акаунт: " + accountTo.getPerson().getName() + " На Счет: " + accountTo.getBill().getNumberValue());
//            accountTo.getBill().setNumberValue(currentBillAccountTo + amount);
//        }
//    }
//}
