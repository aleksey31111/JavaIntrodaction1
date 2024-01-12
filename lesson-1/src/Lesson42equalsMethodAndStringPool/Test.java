package Lesson42equalsMethodAndStringPool;

public class Test {
    // EQUALS of Object and Primitive
    public static void main(String[] args) {
        // Example Equals Primitive. 1
        //int x = 1;  // 1
        //int y = 1;  // 1
        //System.out.println(x == y);  // 1

        // Указатель  Объект
        // animal1 -> {1}
        // animal2 -> {2}

        // EQUALS of OBJECT
        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);  // animal1
        // Для примитивных типов Данных,
        // Сравнение Для Примитивов Не Работаетж,
        // Потому что при Таком Сравнении Сравниваются Указатели.
        //System.out.println(animal1 == animal2);  // 2
        System.out.println(animal1.equals(animal2));

        //Object object = new Object();  // Пояснение Создание
        //object.equals();  // Метода equals Объекта Object
    }
}



class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        Animal otherAnimal = (Animal) obj;

        return this.id == otherAnimal.id;
    }
}

    // Сарвнивание Строк
//public class Test {
//    public static void main(String[] args) {
//        String string1 = new String("Hello");  // Первое Сравнение Строк.
//        String string2 = new String("Hello");
//
//        System.out.println(string1.equals(string2));

        // String Pool. string2 Ссылается на Объект Указателя string1
        // string1  ->  {Hello}
        // string2  ->  {Hello} Поэтому:
//        String string1 = "Hello";
//        String string2 = "Hello";
//        System.out.println(string1 == string2);
//    }
//}

    // Сравнивание строк, Усекая Одну с Помощъю substring(нач_эл, кон_эл - 1)
//public class Test {
//        public static void main(String[] args) {
//            String a = "hello";
//            String b = "hello123".substring(0, 5);
//
//            System.out.println(b);
//            System.out.println(a.equals(b));  // a==b Не работает
//
//        }
//}
