package dataStructures.reverseArray;

public class ReverseArrayUsedCicle_OnPlace {
    // Функция Переворота arr[] От Начала к Концу:
    static void reverseArray(int arr[], int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    /* Утилита, выводящая массив в строку */
    static void  printArray(int arr[], int size) {
        for (int i = 0;i < size;i++)
            System.out.println(arr[i] + " ");
        System.out.println();
    }

    // Ведущий Код
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        printArray(arr, 6);
        reverseArray(arr, 0, 5);
        System.out.println("Перевернутый Массив Является \n");
        printArray(arr, 6);
    }
}
