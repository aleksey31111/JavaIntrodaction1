package Task_15_Try_ContiniousOwnImplementation_SinglyLinkedList;

import Task_15_Try_ContiniousOwnImplementation_SinglyLinkedList.singlyLinkedList.LinkedList;

import static Task_15_Try_ContiniousOwnImplementation_SinglyLinkedList.singlyLinkedList.LinkedList.printList;

public class Main {
    public static void main(String[] args) {
        /* Старт С Пустым Листом. Создание Пустого Листа. */
        LinkedList list = new LinkedList();

        // ******* Вставка *********
        list = LinkedList.insert(list, 1);
        list = LinkedList.insert(list, 2);
        list = LinkedList.insert(list, 3);
        list = LinkedList.insert(list, 4);
        list = LinkedList.insert(list, 5);
        list = LinkedList.insert(list, 6);
        list = LinkedList.insert(list, 7);
        list = LinkedList.insert(list, 8);

        // Печать LinkedList
        printList(list);
    }
}
