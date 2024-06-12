package dataStructures.unsortedArray_Search_Insert_Delete;
// Java-программа для реализации линейного
// поиск в несортированных массивах
public class FindOperation {
    static int findElement(int arr[], int n, int key) {
        for (int i = 0; i < n; i++)
            if (arr[i] == key)
                return i;
        return -1;
    }

    // Ведущий Код
    public static void  main(String args[]) {
        int arr[] = { 12, 14, 10, 6, 40};
        int n = arr.length;

        // Использование Последнего Элемента как Поиск Элемента.
        int key = 40;

        // Вызов Функции:
        int position = findElement(arr, n, key);

        if (position == -1)
            System.out.println("Element Not found");
        else
            System.out.println("Элемент в Позиции Не Найден: " +
                    (position + 1));
    }
}

// Этот код предоставлен syedsarfarazahammed