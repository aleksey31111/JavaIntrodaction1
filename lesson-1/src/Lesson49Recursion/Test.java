package Lesson49Recursion;

//public class Test {
    //public static void main(String[] args) {
//Recursion - Вызов Метода в Теле Этого же Метода.
    //    someMethod();  // Бесконечный Вызов someMethod()
    //}

    // someMethod() -> someMethod() -> someMethod() -> ...
    //private static void someMethod() {
    //    System.out.println("Hello!");
    //    someMethod();  // С Помощъю Рекурсии.
    //}

//    public static void main(String[] args) {
//        counter(3);
//    }
    // counter(3) -> counter(2) -> counter(1) -> counter(0)

    // counter(3)
    // counter(2)
    // counter(1)
    // counter(0)
//    private static void counter(int n) {
//        if (n == 0) return;  // 3 2 1 Выход При 0
//        System.out.println(n);
//
        //if (n == 0) return;  // 3 2 1 0

//        counter(n - 1);  // 3 2 1
//    }
//}
public class Test {

    public static void main(String[] args) {
        // Вычисление Факториала с Помощъю Рекурсии
        // 4! = 4 * 3 * 2 * 1
        // 1! = 1
        // 15! = 15 * 14 * 13 * 12 * ... * 1
        // 0! = 1

        System.out.println(fac(4));
    }

    // fac(4)
    // 4 * fac(3)
    // 3 * fac(2)
    // 2 * fac(1)
    // 1

    public static int fac(int n) {
        if (n == 1)
            return 1;

        return n * fac( n - 1);
    }
}

