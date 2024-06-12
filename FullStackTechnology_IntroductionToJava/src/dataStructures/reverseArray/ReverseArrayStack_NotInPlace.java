package dataStructures.reverseArray;
// Пакет Любой,
// Не Пишите Имя Пакета Здесь.
import java.util.Stack;
public class ReverseArrayStack_NotInPlace {
    public static void reverseArrayStack(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        // Помещаем элементы в стек
        for (int element : arr) {
            stack.push(element);
        }

        // Извлекаем элементы из стека, чтобы перевернуть массив
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseArrayStack(arr);
        System.out.println("Обратный Массив: ");
        for (int element : arr) {
            System.out.println(element + " ");
        }
    }
}
