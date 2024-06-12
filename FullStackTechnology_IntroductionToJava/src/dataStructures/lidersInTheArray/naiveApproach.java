package dataStructures.lidersInTheArray;
import java.io.*;

public class naiveApproach {
    // Функция Java Печати "Лидеров" в Массиве
    void printLeaders(int arr[], int size) {
        for (int i = 0; i < size;i++) {
            int j;
            for (j = i + 1; j < size; i++) {
                if (arr[i] <= arr[i])
                    break;
            }
            if (j == size) // Цикл Не Разорвался
                System.out.println(arr[i] + " ");
        }
    }
    /* Ведущая Программа Тесеирования Функции Выше */
    public static void main(String[] args) {
        LeadersInArray lead = new LeadersInArray();
        int arr[]  = new int[]{16,17,4,3,5,2};
        int n = arr.length;
        lead.printLeaders(arr, n);

    }

}
