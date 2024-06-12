package dataStructures.unsortedArray_Search_Insert_Delete;
// Java Программа Для Реалмзации Операции Удаления
// В Несортированном Массиве.
public class DeleteElement {
    // Функция Поиска Ключа Для Удаления:
    static int findElement(int arr[], int n, int key) {
        int i;
        for (i = 0; i < n; i++)
            if (arr[i] == key)
                return i;
        return  -1;
    }

    // Функция Для Удаления Элемента
    static int deleteElement(int arr[], int n, int key)
    {
        // Найти Позицию Элемента Для Удаления:
        int pos = findElement(arr, n, key);
        if (pos == -1) {
            System.out.println("Елемент Не Найден");
            return n;
        }

        // Удаление Элемента:
        int i;
        for (i = pos; i < n - 1; i++)
            arr[i] = arr[i + 1];

        return n - 1;
    }

    // Ведущий Код:
    public static void main(String args[]) {
        int i;
        int arr[] = { 10, 50, 30, 40, 20 };

        int n = arr.length;
        int key = 30;

        System.out.println("Массив Перед Удалением: ");
        for (i = 0; i < n; i++)
            System.out.println(arr[i] + " ");

        // Функция Вызщва
        n = deleteElement(arr, n, key);

        System.out.println("\n\nМассив После Удаления: ");
        for (i = 0; i < n; i++)
            System.out.println(arr[i] + " ");
    }
}
