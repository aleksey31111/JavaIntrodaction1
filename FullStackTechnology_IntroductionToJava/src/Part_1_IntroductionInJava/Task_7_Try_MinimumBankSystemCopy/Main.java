//package Part_1_IntroductionInJava.Task_7_Try_MinimumBankSystem;

//import Part_1_IntroductionInJava.Tasr_7_BankAplicationOnJavaKlass_Person_Account__MyWayInGerman.Person;

//import Part_1_IntroductionInJava.Task_7_Try_MinimumBankSystem.Service.AdjustmentService;
//import Part_1_IntroductionInJava.Task_7_Try_MinimumBankSystem.Service.PaymentService;
//import Part_1_IntroductionInJava.Task_7_Try_MinimumBankSystem.Service.TransferService;
//import Part_1_IntroductionInJava.Task_7_Try_MinimumBankSystem.module.Account;
//import Part_1_IntroductionInJava.Task_7_Try_MinimumBankSystem.module.Bill;
//import Part_1_IntroductionInJava.Task_7_Try_MinimumBankSystem.module.Person;

/**
 * Минимальная банковская система будет состоять из классов (сущностей):
 * Bill (счет);
 * Account (аккаунт);
 * Person (личность человека);
 * Deopsit (пополнение счета);
 * Payment (платеж);
 *
 * Сценарии:
 * Созадние нескольких аккаунтов и счетов
 *  В классах-сервисах (Напримет класс PaymentService)
 *  совершенить платежа (уменьшение счета)
 *      депозит (DepositService) (увеличение счета);
 *          Перевод денег с одного аккаунта на другой;
 *              Создать дополнительный класс TransferService,
 *              создать в нем метод transfer и реализовать логику
 *              перевода денег с одного аккаунта на другой.
 *
 * В методе main не должно происходить никакой логики, кроме вызовов сервисов.
 *
 * Сервисы будут выполнять все действия,
 *
 * в методе main можно только создавать изначальные объекты и вызывать сервисы
 *
 * Так же стоит предусмотреть критические случаи,
 * например не оставлять отрицательную сумму на счету
 */
//public class Main {
//    public static void main(String[] args) {
//        Person person1 = new Person("Jhim", "Guardianv", "12-34-56");
//        Bill person1Bill = new Bill(400_000);
//        Account person1Account = new Account(person1, person1Bill);
//
//        Person person2 = new Person("Djarold", "Guardian", "13-46-67");
//        Bill person2Bill = new Bill(500_000);
//        Account person2Account = new Account(person2, person2Bill);
//
        //System.out.println(Person.getName() + Person.getSurname() + Person.getTelephon());
        //Person.setName("Boris");
        //Person.setSurname("Borisov");
        //Person.setTelephon("13-13-13");
        //System.out.println(Person.getName() + Person.getSurname() + Person.getTelephon());
//        AdjustmentService adjustment = new AdjustmentService();
//        adjustment.adjustmentService(person1Account, 400_000);
//        adjustment.adjustmentService(person2Account, 500_000);
//        PaymentService pay = new PaymentService();
//        pay.paymentService(person1Account, 700_000);
//        pay.paymentService(person2Account, 900_000);
//        pay.paymentService(person1Account, 700_000);
//        pay.paymentService(person2Account, 900_000);
//        TransferService transferService = new TransferService();
//        transferService.transferService(person1Account, person2Account, 100_000);
//    }
//}
