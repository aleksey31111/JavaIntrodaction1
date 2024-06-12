package dataStructures.reverseArray;
import java.util.Arrays;
public class BuiltInReversArrayMethods_NotInPlace {
    public static void main(String[] args) {
        int[] originalArray = { 1, 2, 3, 4, 5};

        // Использование Встроеного Метода В Java
        int[] reverseArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length;i++) {
            reverseArray[i]
                    = originalArray[originalArray.length - 1 - i];
        }

        // Печать Обратного Массива
        System.out.println(Arrays.toString(reverseArray));
    }
}
