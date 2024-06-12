package dataStructures.unsortedArray_Search_Insert_Delete;
// Java-программа для реализации вставки
// операция с несортированным массивом.
public class InsertFinalElement {
    // Функция для вставки заданного ключа
    // массив. Эта функция возвращает n+1
    // если вставка прошла успешно, иначе n.
    static int insertSorted(int arr[], int n, int key, int capacity) {
        // Невозможно вставить больше элементов, если n
        // уже больше или равно
        // емкость
        if (n >= capacity)
            return n;
        arr[n] = key;
        return (n+1);
    }

    // Ведущий Код
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;
        arr[5] = 70;
        int capacity = 20;
        int n = 6;
        int i, key = 26;
        System.out.println("До Вставки: ");
        for (i = 0; i < n; i++)
            System.out.println(arr[i] + " ");

        // Вставка Ключа:
        n = insertSorted(arr, n, key, capacity);

        System.out.println("\n После Вставки: ");
        for (i = 0; i < n; i++)
            System.out.println(arr[i] + " ");

    }
}

// Этот код предоставлен syedsarfarazahammed