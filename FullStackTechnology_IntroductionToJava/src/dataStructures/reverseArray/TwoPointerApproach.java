package dataStructures.reverseArray;

public class TwoPointerApproach {
    public static void reverseArrayTwoPointer(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // Меняем местами элементы в начальной и конечной позициях
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Перемещаем начало вперед и конец назад
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseArrayTwoPointer(arr);
        System.out.println("Обратный Массив");
        for(int i=0; i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
