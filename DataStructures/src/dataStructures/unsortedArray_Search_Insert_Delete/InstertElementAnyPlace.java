package dataStructures.unsortedArray_Search_Insert_Delete;

/*package whatever //do not write package name here */
/*пакет любой //не записывайте здесь имя пакета */

// Java-программа для вставки элемента
// в определенную позицию массива
public class InstertElementAnyPlace {  // GFG
    static void insertElement(int arr[], int n, int x, int pos) {
        // сдвигаем элементы вправо
        // которые находятся справа от позиции:
        for (int i = n - 1; i >= pos; i--)
            arr[i + 1] = arr[i];
        arr[pos] = x;
    }

    public static void main(String[] args) {
        int arr[] = new int[15];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 1;
        arr[3] = 8;
        arr[4] = 5;

        int n = 5;
        int x = 10, pos= 2;

        System.out.println("Перед вставкой: ");
        for (int i = 0; i < n; i++)
            System.out.println(arr[i] +  " ");

        // Вставка ключа в определенную позицию:
        insertElement(arr, n, x, pos);
        n += 1;

        System.out.println("\n\nПосле Вставки");
        for (int i = 0; i < n; i++)
            System.out.println(arr[i] + " ");
    }
}
// Этот код предоставлен syedsarfarazahammed