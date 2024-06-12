package dataStructures.reverseArray;
// Пакет Любой,
// Не Записывайте Здесь Имя Пакета.
public class BackwardArrayRecursion_InPlace_or_OutOfPlace {
    // Функция для Переворачивания Массива arr[] От Начала До Конца
    static void reverseArray(int arr[], int start, int end) {
        int temp;
        if(start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start + 1, end - 1);
    }
    // Утилита которая Печатает Массив в Строку
    static void printArray(int arr[], int size) {
        for (int i = 0; i < size;i++)
            System.out.println(arr[i] + " ");
        System.out.println("");
    }

    // Функция Драйвера для Проверки Вышеуказанных Функций
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        printArray(arr, 6);
        reverseArray(arr, 0, 5);
        System.out.println("Обратный Массив Является ");
        printArray(arr, 6);
    }
}
