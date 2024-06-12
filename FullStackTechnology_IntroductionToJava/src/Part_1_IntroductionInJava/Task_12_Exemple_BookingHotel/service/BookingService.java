package Part_1_IntroductionInJava.Task_12_Exemple_BookingHotel.service;

import Part_1_IntroductionInJava.Task_12_Exemple_BookingHotel.entity.Bill;
import Part_1_IntroductionInJava.Task_12_Exemple_BookingHotel.entity.Client;
import Part_1_IntroductionInJava.Task_12_Exemple_BookingHotel.entity.Hotel;
import Part_1_IntroductionInJava.Task_12_Exemple_BookingHotel.entity.Room;

public class BookingService {
    public void book(Hotel hotel, Client client, int numberOfPerson) {
        Room[] rooms = hotel.getRoom();
        boolean isFreeRooms = false;
        for (Room room :
                rooms) {
            if (room.isFree()) {
                isFreeRooms = true;
            }
        }
        if (!isFreeRooms) {
            System.out.println("Свободных Номеров в Отеле: " + hotel.getName()
            + " Нет!!!");
        }
        bookRoom(client, numberOfPerson, rooms);
    }

    private static void bookRoom(Client client, int numberOfPerson, Room[] rooms) {
        // Дополнительная Переменная Для Уменьшения Количества Записей в Консоли!!!
        boolean success = false;
        // Свёртывания Выражения "client.getName"
        String clientName = client.getName();
        for (Room room :
                rooms) {
//            String clientName = client.getName();
            if (room.getNumberOfPerson() == numberOfPerson) {
                success = true;
                System.out.println("Нашелся Номер Для Клиента: " + clientName);
                if (client.getBill().getAmount() >= room.getCost()) {
                    Bill clientBill = client.getBill();
                    clientBill.setAmount(clientBill.getAmount() - room.getCost());
                    // Бронирование Номера.
                    room.setFree(false);
                    System.out.println("Номер Был Успешно Забронирован Клиентом! "
                            + clientName);
                } else {
                    System.out.println(clientName + " Не Хватило Денег!");
                }
            }
//            else {
//                System.out.println("Не Нашлось Нужного Номера для Клиента: " + clientName);
//            }
//            if (!success) {
//                System.out.println("Не Нашлось Подходящего Номера Для Клиента: " + clientName);
//            }
        }
        if (!success) {
            System.out.println("Не Нашлось Подходящего Номера Для Клиента: " + clientName);
        }
    }
}
