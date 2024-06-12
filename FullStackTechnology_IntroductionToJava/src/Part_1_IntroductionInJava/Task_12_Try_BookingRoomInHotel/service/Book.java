package Part_1_IntroductionInJava.Task_12_Try_BookingRoomInHotel.service;

import Part_1_IntroductionInJava.Task_12_Try_BookingRoomInHotel.entity.Client;
import Part_1_IntroductionInJava.Task_12_Try_BookingRoomInHotel.entity.Hotel;
import Part_1_IntroductionInJava.Task_12_Try_BookingRoomInHotel.entity.Room;

public class Book {
//    public void booking(Client client, int amount) {
//        if (client.getBill().getAmount() < amount) {
//            System.out.println("Не Достаточно Средств На Счёте!!!");
//        }else {
//            int currentAmount = client.getBill().getAmount();
//            System.out.println("Имя: " + client.getName() + "Текущий Баланс, до снятия Денег: " + currentAmount);
//            client.getBill().setAmount(currentAmount - amount);
//            System.out.println("Имя: " + client.getName() + "Баланс, После Снятия Денег: " + client.getBill().getAmount());
//        }
//    public void booking(Client client,Hotel hotel, int room,int amount) {
//        System.out.println("Текущий Баланс: " + client.getBill().getAmount());
//        System.out.println(client.getName());
//        System.out.println(hotel.getRoom().getPersonNumberOfRoom());

//        if (hotel.getRoom().getCost() < amount) {  // client.getBill().getAmount()) {

//            if (hotel.getRoom().getPersonNumberOfRoom() == room) {

//                if (!hotel.getRoom().isFree()) {
//                    System.out.println("Имя Клиента: " + client.getName() + ". Снимает Номер на " + hotel.getRoom().getPersonNumberOfRoom() + " Человек. В Отеле: " + hotel.getTitle());
//                    System.out.println("У Вас Спишутся Со Счета " + client.getBill().getAmount() + ": -" + hotel.getRoom().getCost());
//                    if (TransactionConfirmation.transactionConfirmation() == 'y') {
//                        client.getBill().setAmount(client.getBill().getAmount() - hotel.getRoom().getCost());
//                        System.out.println("Имя Клиента: " + client.getName() + " Текущий Баланс = " + client.getBill().getAmount());
//                    } else {
//                        System.exit(0);
//                    }
//                }else {
//                    System.out.println("Комната Занята Закажите Другой Номер!!!");
//                }

//            } else {
//                System.out.println("Нет Подходящих Номеров в Этоь Отеле!");
//            }

//        } else {
//            System.out.println("У вас На Счету Не Достаточно Денег!");
//        }

    public void booking(Hotel hotel, Client client, int personNumber) {  //,Room roomForLive) {
//        Room rooms = hotel.getRoom()[];
//        Room[] rooms = hotel.getRoom();
        boolean isFreeRooms = false;
        for (Room r:
             hotel.getRoom()) {
            if (r.isFree()) {
                isFreeRooms = true;
            }
        }
        if (!isFreeRooms) {
            System.out.println("СВОБОДНЫХ НОМЕРОВ НЕТ для КЛИЕНТА: " + client.getName() +
                    ", В ОТЕЛЕ: " + hotel.getTitle() + " НЕТ!!!");
        }
        boolean success = false;

        for (Room room: hotel.getRoom()) {
            if (room.getPersonNumberOfRoom() == personNumber) {

                success = true;
                System.out.println("Нашёлся Номер На: " + personNumber + " Человек, "
                + "В Отеле: " + hotel.getTitle() + " На Сумму: " + room.getCost() + ", На Счету Клиента Присутствует: " +  client.getBill().getAmount() + " Денежных Средств.");
                if (client.getBill().getAmount() >= room.getCost()) {
                    ;
                    client.getBill().setAmount(client.getBill().getAmount() - room.getCost());
                    room.setFree(false);
                    System.out.println("Номер Быд Успешно Забронирован Клиентом: " + client.getName() + ", В Отеле: " + hotel.getTitle() + ", На Сумму: " + room.getCost() + ", На Счету Клиента Осталось: " +  client.getBill().getAmount());
                } else {
                    System.out.println("Клиенту: " + client.getName() + ", Со Счетом: " + client.getBill().getAmount() + " Не Хватило Денег На Номер Стоимостью: " + room.getCost() + ", На: " +personNumber+" Человек!");
                }
            }
        }
        if (!success) {
            System.out.println("Свободного Номера На: " + personNumber + ", В Отеле: " + hotel.getTitle() + ", Для Клиента: " + client.getName() + " Нет!!!");
        }
    }
}
