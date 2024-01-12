package Lesson43NestedClasses;
    // Три Типа Классов в Java:
    // 1 - Приватный.

public class Electrocar {
    private int id;
    //private static int test; // Доступное Полу для Статических Вложенных Классов.

    // Первый Тип Вложенных Классов в Java
      // Вложенный Не Статический Класс. Имеет Доступ к Полям Объекта.
    private class Motor{
        public void startMotor() {
            System.out.println("Motor " + id + " is Starting...");
        }
    }

    // Второй Тип Вложенных Классов -   Вложенный Статический Класс.
    //                                  Имеет Доступ к Статическим Полям Объекта.
    public static class Battery {
        public void Charge() {
            System.out.println("Battery is Charging...");
        }
    }

    public Electrocar(int id) {
        this.id = id;
    }
    public void start() {
        Motor motor = new Motor();
        motor.startMotor();

        final int x = 1;

        // Третий Тип Вложенных Классов -
        //  Вложенные Классы Находящиеся в Методе.
        //  Имеет Доступ к Не Статическим Полям, к Переменным Константам и Метовам.
        class SomeClass {
            public void someMethod() {
                System.out.println(x);
                System.out.println(id);
            }
        }
        SomeClass someObject = new SomeClass();
        //test(someObject);


        System.out.println("Electrocar " + id + " is Starting...");
    }
}
