public class Lesson24ClassObjectMetod_toString {
    public static void main(String[] args) {
        String string = "Hello";
        System.out.println(string);
        Human1 h1 = new Human1("Bob", 40);
//        h1.toString();
        System.out.println(h1);
    }
}

class Human1{
    private String name;
    private int age;
    public Human1(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){  // Переопределение Метода
        return name + ", " + age;  // toString, который Вызывается
    }  // Для Каждого Обьекта
}
