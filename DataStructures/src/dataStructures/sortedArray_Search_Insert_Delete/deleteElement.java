package dataStructures.sortedArray_Search_Insert_Delete;
// Программа Java для Удаления
// Элемента Из Сортированного Элемента
public class deleteElement {
    // Двоичный Поиск:
    static int binarySearch(int arr[], int low, int high, int key) {
        if (high < low)
            return -1;
        int mid = (low + high) / 2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return binarySearch(arr, (mid+1), high, key);
        return binarySearch(arr, low, (mid-1), key);
    }

    // Функция Для Удаления Элемента
    static int deleteElement(int arr[], int n, int key) {
        // Найти Позицию Элемента для Удаления
        int pos = binarySearch(arr, 0, n - 1, key);
        if (pos == -1) {
            System.out.println("Элемент Не Найден.");
            return n;
        }

        // Удаление Элемента
        int i;
        for (i = pos; i < n -1; i++)
            arr[i] = arr[i + 1];
        return n-1;
    }
    // Ведущий Код
    public static void main(String[] args) {
        int i;
        int arr[] = {10, 20, 30, 40, 50};
        int n = arr.length;
        int key = 30;
        System.out.println("Массив До Удаления:\n");
        for (i = 0; i < n; i++)
            System.out.println(arr[i] + " ");

        // Функция Вызова
        n = deleteElement(arr, n, key);
        System.out.println("\n\nМассив После Удаления: \n");
        for (i = 0; i < n; i++)
            System.out.println(arr[i] + " ");
    }

}
