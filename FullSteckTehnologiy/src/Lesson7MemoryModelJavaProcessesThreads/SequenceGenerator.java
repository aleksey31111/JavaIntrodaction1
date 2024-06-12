package Lesson7MemoryModelJavaProcessesThreads;

import java.util.concurrent.atomic.AtomicInteger;

// Генератор Уникальных Чисел
public class SequenceGenerator {
//    private int number;
    // Использование Специфльного Типа "AtomicInteger"
    private AtomicInteger number = new AtomicInteger();
//    public int generate() {
    // Что Такое "synсhronized" как Модификатор к Методу.
    public /*synchronized*/ int generate() {
        // Усыпляем ПОТОКИ
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
            System.out.println("Ошибка в Потоке, Поток Не Заснул.");
        }
        // number, +1, =
        return number.incrementAndGet();
    }
}
