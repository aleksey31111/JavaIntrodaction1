public class Lesson23StringBulderUnMutable {
    public static void main(String[] args) {
        System.out.println("Первая Часть Урока работа с Неизменяемыми Объектами \"String\"");
        String x = "hello";
        String x1 = new String("Hello 1 !");
        x = x.toUpperCase();
        System.out.println("Строка: " + x);
        x1 = x1.toUpperCase();
        System.out.println("Строка 1: " + x1);
        System.out.println();
        System.out.println("Вторая Часть Урока 'Конкатенация': ");
        String string1 = "Hello";
        String string2 = " my";
        String string3 = " friend!!";
        String stringAll = string1 + string2 + string3;
        System.out.println(stringAll);
        System.out.println("Третья Часть Урока 'StringBuilder' из unmutable в mutable: ");
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.toString());
        sb.append(string1);
        sb.append(string2);
        sb.append(string3);
        System.out.println(sb.toString());
        StringBuilder sb1 = new StringBuilder("Hello");
        System.out.println(sb1.toString());
        sb1.append(string2);
        sb1.append(string3);
        System.out.println(sb1.toString());
        System.out.println();
        System.out.println(sb1.append("!").append(" ").append(string1).append(string2).append(string3).append("!"));
        System.out.println("Четвертая часть Урока 'printf' Форматирование Серок");
        System.out.printf("This is a string, %s", "NICE");
        System.out.println();
        System.out.printf("This is a string, %d", 13);
        System.out.println();
        System.out.printf("%f This is %s a string, %d \n", 13.3, "HIHI", 13);
        System.out.printf("String1 %-10d \n", 13);
        System.out.printf("String1 %10d \n", 13);
        System.out.printf("String2 %10d \n", 133333333);
        System.out.printf("String3 %10d \n", 1333333333);
        System.out.printf("String1 %15.2f \n", 13.33333333333333);
    }
}
