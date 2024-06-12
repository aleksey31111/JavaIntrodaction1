package Task_15_Try_ContiniousOwnImplementation_SinglyLinkedList.singlyLinkedList;

public class LinkedList {
    Node head; // head of List

    /* Linked List Node */
    /* Конструктор для Создания Нового Элеметна "node" */
    /* По Умолчанию Следующий Устанавливается в "null" */
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Метод Вставки Нового Элемента "node".
    public static LinkedList insert(LinkedList list, int data) {
        // Создание Нового Элемента "node" с Данными
        Node new_node = new Node(data);
        // Если LinkedList Является Пустым,
        // Создаём Элемент "node" в Заголовке:
        if (list.head == null) {
            list.head = new_node;
        } else {
            // Иначе Пройти До Последнего Узла
            // И Вставляем Туда "new_node".
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            // Вставляем new_node как Последний Узел.
            last.next = new_node;
        }
        // Вернуть Список По Заголовку.
        return list;
    }

    // Метод Печати LinkedList.
    public static void printList(LinkedList list) {
        Node currNode = list.head;
        System.out.println("LinkedList: ");

        // Пройти Через LinkedList.
        while (currNode != null) {
            // Печать Данных Текущего Узла.
            System.out.println(currNode.data + " ");

            // Переход к Новому Узлу.
            currNode = currNode.next;
        }
    }

    // Код Драйвера. Или Точка Входа.
}