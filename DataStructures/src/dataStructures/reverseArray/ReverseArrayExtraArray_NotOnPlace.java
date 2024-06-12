package dataStructures.reverseArray;
// Пакет Любой,
// Не Записывайте Здесь Имя Пакета.

public class ReverseArrayExtraArray_NotOnPlace {
    public static void reverseArrayExtraArray(int[] arr) {
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] =  arr[arr.length - i - 1];
        }
        // Печать Обратного Массива:
        System.out.println("Обратный Массив: ");
        for (int i : reversedArr) {
            System.out.println(i + " ");
        }
    }
    public static void main(String[] args) {
        int[] originalArr = {1, 2, 3, 4, 5};
        reverseArrayExtraArray(originalArr);
    }
}
