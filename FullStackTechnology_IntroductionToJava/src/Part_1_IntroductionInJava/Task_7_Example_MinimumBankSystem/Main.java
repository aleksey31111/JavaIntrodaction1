package Part_1_IntroductionInJava.Task_7_Example_MinimumBankSystem;

import Part_1_IntroductionInJava.Task_7_Example_MinimumBankSystem.entity.Account;
import Part_1_IntroductionInJava.Task_7_Example_MinimumBankSystem.entity.Bill;
import Part_1_IntroductionInJava.Task_7_Example_MinimumBankSystem.entity.Person;
import Part_1_IntroductionInJava.Task_7_Example_MinimumBankSystem.service.DepositService;
import Part_1_IntroductionInJava.Task_7_Example_MinimumBankSystem.service.PaymentService;
import Part_1_IntroductionInJava.Task_7_Example_MinimumBankSystem.service.TransferService;

public class Main {
    public static void main(String[] args) {
        Person olegYankovskiy = new Person("Олег", "Янковский", "11-11-11");
        Bill olegYankovsriyBill =new Bill(150_000);
        Account olegYankovskiyAccount = new Account(olegYankovskiy, olegYankovsriyBill);
//        System.out.println(Person.getName() + ' ' + Person.getSurname() + ' ' + Person.getPhoneNumber() + ' ' + Bill.getAmount() + ' ' + Account.getAccountHolder());
//        System.out.println(olegYankovskiy);
//        System.out.println(olegYankovsriyBill);
        System.out.println(olegYankovskiyAccount);
        PaymentService paymentService = new PaymentService();
        paymentService.pay(olegYankovskiyAccount, 100_000);
        System.out.println(olegYankovskiyAccount);
        DepositService depositService = new DepositService();
        depositService.deposit(olegYankovskiyAccount, 133_000);
        System.out.println(olegYankovskiyAccount);
        TransferService transferService = new TransferService();
        System.out.println();

        Person sergeyGarmash = new Person("Сергей", "Гармаш", "22-22-22"); // + ' ' + Bill.getAmount());
        Bill sergeyGarmashBill = new Bill(250_000);
        Account sergeyGarmashAccount = new Account(sergeyGarmash, sergeyGarmashBill);
//        System.out.println(Person.getName() + ' ' + Person.getSurname() + ' ' + Person.getPhoneNumber() + ' ' + Bill.getAmount());
//        System.out.println(sergeyGarmash);
//        System.out.println(sergeyGarmashBill);
        System.out.println(sergeyGarmashAccount);
        paymentService.pay(sergeyGarmashAccount, 100_000);
//        System.out.println(sergeyGarmashAccount);
        depositService.deposit(sergeyGarmashAccount, 133_000);
        transferService.transfer(olegYankovskiyAccount, sergeyGarmashAccount, 50_000);
        System.out.println(olegYankovskiyAccount);
        System.out.println(sergeyGarmashAccount);
        System.out.println();

        Person evgeniyMironov = new Person("Евгений", "Миронов", "33-33-33");
        Bill evgeniyMironovBill = new Bill(350_000);
        Account evgeniyMironovAccount = new Account(evgeniyMironov, evgeniyMironovBill);
//        System.out.println(Person.getName() + ' ' + Person.getSurname() + ' ' + Person.getPhoneNumber() + ' ' + Bill.getAmount());
//        System.out.println(evgeniyMironov);
//        System.out.println(evgeniyMironovBill);
        System.out.println(evgeniyMironovAccount);
        paymentService.pay(evgeniyMironovAccount, 100_000);
        depositService.deposit(evgeniyMironovAccount, 133_000);

        Person vladimirIlyin = new Person("Владимир", "Илъин", "44-44-44");
        Bill vladimirIlyinBill = new Bill(450_000);
        Account vladimirIlyinAccount = new Account(vladimirIlyin, vladimirIlyinBill);
//        System.out.println(Person.getName() + ' ' + Person.getSurname() + ' ' + Person.getPhoneNumber() + ' ' + Bill.getAmount());
//        System.out.println(vladimirIlyin);
//        System.out.println(vladimirIlyinBill);
        System.out.println(vladimirIlyinAccount);
        paymentService.pay(vladimirIlyinAccount, 100_000);
        depositService.deposit(vladimirIlyinAccount, 133_000);


        Person konstantinHabenskiy = new Person("Константин", "Хабенский", "55-55-55");
        Bill konstantibHabensriyBill = new Bill(550_000);
        Account konstantibHabenskiyAccount = new Account(konstantinHabenskiy, konstantibHabensriyBill);
//        System.out.println(Person.getName() + ' ' + Person.getSurname() + ' ' + Person.getPhoneNumber() + ' ' + Bill.getAmount());
//        System.out.println(konstantibHabenskiyAccount);
//        System.out.println(konstantibHabensriyBill);
        System.out.println(konstantibHabenskiyAccount);
        paymentService.pay(konstantibHabenskiyAccount, 100_000);
        depositService.deposit(konstantibHabenskiyAccount, 133_000);

        Person annaMashkova = new Person("Анна", "Михалкова", "66-66-66");
        Bill annaMashkovaBill = new Bill(650_000);
        Account annaMashkovaAccount = new Account(annaMashkova, annaMashkovaBill);
//        System.out.println(Person.getName() + ' ' + Person.getSurname() + ' ' + Person.getPhoneNumber() + ' ' + Bill.getAmount());
//        System.out.println(annaMashkova);
//        System.out.println(annaMashkovaBill);
        System.out.println(annaMashkovaAccount);
        paymentService.pay(annaMashkovaAccount, 100_000);
        depositService.deposit(annaMashkovaAccount, 133_000);

        Person ninaLyadova = new Person("Нина", "Лядова", "77-77-77");
        Bill ninaLyadovaBill = new Bill(750_000);
        Account ninaLyadovaAccount = new Account(ninaLyadova, ninaLyadovaBill);
//        System.out.println(Person.getName() + ' ' + Person.getSurname() + ' ' + Person.getPhoneNumber() + ' ' + Bill.getAmount());
//        System.out.println(ninaLyadova);
//        System.out.println(ninaLyadovaBill);
        System.out.println(ninaLyadovaAccount);
        paymentService.pay(ninaLyadovaAccount, 100_000);
        depositService.deposit(ninaLyadovaAccount, 133_000);

        Person vladimirMashkov = new Person("Владимир", "Машков", "88-88-88");
        Bill vladimirMashkovBill = new Bill(850_000);
        Account vladimirMashkovAccount = new Account(vladimirMashkov, vladimirMashkovBill);
//        System.out.println(Person.getName() + ' ' +  Person.getSurname() + ' ' + Person.getPhoneNumber() + ' ' + Bill.getAmount());
//        System.out.println(vladimirMashkov);
//        System.out.println(vladimirMashkovBill);
        System.out.println(vladimirMashkovAccount);
        paymentService.pay(vladimirMashkovAccount, 100_000);
        depositService.deposit(vladimirMashkovAccount, 133_000);
        transferService.transfer(vladimirMashkovAccount,ninaLyadovaAccount,  100_000_000);
        System.out.println(vladimirMashkovAccount);
        System.out.println(ninaLyadovaAccount);
    }
}
