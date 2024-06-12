package Part_1_IntroductionInJava;

import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        int[] mass1 =new int[15];
        // Для Хранения Позитивных Чисел.
        int positiveNum = 0;
        // Формируем Первый Массив.
        int j = 0;
        for (int element : mass1) {
            element = (int) (Math.random() * 100 - 50);
            mass1[j] = element;
            if(mass1[j] > 0) {
                positiveNum++;
            }
            j++;
        }
        System.out.println("Первый Массив: ");
        System.out.println(Arrays.toString(mass1));
        System.out.println();

        // Формируем Второй Массив.
        int[] mass2 = new int[positiveNum];
        int index = 0;
        int t = 0;
        for (int element2 : mass1) {
            mass1[t] = element2;
            if(mass1[t] > 0) {
                mass2[index] = mass1[t];
                index++;
            }
            t++;
        }
        System.out.println("Массив с Позитивными Числами Первого Массива: ");
        System.out.println(Arrays.toString(mass2));
        System.out.println();
        // Вычисляем Сумму Второго Массива:
        int sumPosNumPass2 = 0;
        int r = 0;
        for (int element2: mass2) {
            sumPosNumPass2 = sumPosNumPass2 + mass2[r];
            r++;
        }
        System.out.println("Сумма Второго Массива: " + sumPosNumPass2);
        System.out.println("Среднее Арифметическое Второго Массиваф: " + sumPosNumPass2/mass2.length);
    }
}
