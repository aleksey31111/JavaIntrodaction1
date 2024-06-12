package Task_15_Try_ContiniousOwnImplementation_SinglyLinkedList.singlyLinkedList.Generic_LinkedList;

import java.util.List;

public class GFG {
    // Главный Управляющий Метод
    public static void main(String[] args) {
        // Спмсок Чисел Обёртки Integer:
        // Создание Пустого Список Чисел Обёртки Ibteger
        // LinkedList:
        list<Integer> list1 = new list<>();
        System.out.println("Обёртка Integer LinkedList" +
                "Создано Как list1: ");
        // Добавление Элементов в Указанный
        // Выше LinkedList (Объект Списка).

        // Элемент С 1 До 100:
        list1.add(100);
        // Элемент С 2 До 200:
        list1.add(200);
        // Элемент С 3 До 300
        list1.add(300);
        // Отображение Только Сообщения
        System.out.println("Лист1 После Добавления 100, 200 И 300 :");
        // Печать И Отображение Элементов в Указанный Выше Список:
        System.out.println(list1);

        // Удаляем 200 Из list1
        list1.remove(200);
        // Отобразить Только Сообщение:
        System.out.println("list1 После Удаления 200 : ");
        // Печать И Отображение Вновь Обновлённого Списка:
        System.out.println(list1);

        // Строка LinkedList
        // Создание Нового Пустого Строкового Объекта Списка:
        list<String> list2 = new list<>();
        System.out.println(
                "\n Строка LinkedList Созданная Как list2"
        );
        // Добавление Элементов В Указанный Выше Объект Списка

        // Элемент 1 - hello
        list2.add("hello");
        // Элемент 2 - world
        list2.add("world");
        // Отображение Только Сообщения
        System.out.println("list2 После Добавления hello и world");
        // Печать Только Текущегих Элементов:
        System.out.println(list2);
        // Теперь, Добавление Элементов 3 - "GFG" На Позицию 2:
        list2.add(2, "GFG");
        // Отображение Только Сообщения:
        System.out.println("list2 После Добавления GFG В Позицию 2: ");

        // Теперь Печатаем Вновь Обновленный Список,
        // После Вставки Элемента Во Вторую Позицию:
        System.out.println(list2);

        // LinkedList Из Элементов С Плавающей Точкай:
        // Создание Новаго Пустого Объекта Списка Float:
        list<Float> list3 = new list<>();
        // Отображение Только Сообщения:
        System.out.println("\nОбёртка \"Плавающей Точки\" В LinkedList Созданной Как list3");
        // Добавление Элементов В Список Выше:
        // Элемент 1 - 20.25
        list3.add(20.25f);
        // Элемент 2 - 50.42
        list3.add(50.42f);
        // Элемент 3 - 30.99
        list3.add(30.99f);
        // Отображение Только Сообщения:
        System.out.println("list3 После Добавления 20.25, 50.42 И 30.99 : ");
        // Печать И Показ Элементов Списка:
        System.out.println(list3);
        // Отображение Только Сообщения:
        System.out.println("Очищение Списка list3: ");

        // Очищаем Теперь Этот Список Используя  Метод clear():
        list3.clear();
        // Теперь Печатоем И Отображаем Снова Спмсок который Выше:
        System.out.println(list3);

    }
}
