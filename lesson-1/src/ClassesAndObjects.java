public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
//        person1.name = "Роман"; // Т.к. name private мы не можем Обращатся на Прямую к Классам.
        person1.setNameAndAge("Роман", 50);  // Параметры метода
//        person1.age =50; // Т.к. age private мы не можем Обращатся на Прямую к Классам.
//        System.out.println("Меня зовут " + person1.name
//                + ", " + "мне " + person1.age + "лет.");
        person1.sayHello();
        person1.speek();;
        int year1 = person1.calculateYearsToRetirement();
//        System.out.println("Первому человеку до пенсии: " +
//                year1 + "лет.");
        String s1 = "Вова";
        Person person2 = new Person();
//        person2.name = "Вова";
        person2.setNameAndAge(s1, 20);
//        person2.age = 20;
        person2.sayHello();
        person2.speek();
        int years2 = person2.calculateYearsToRetirement();
//        System.out.println("Второму человеку до пенсмм: " +
//                years2 + "лет.");
//        System.out.println("Меня зовут " + person2.name
//                + ", " + "мне " + person2 .age + "лет.");
        System.out.println("###########################################");
        System.out.println("урок 18 Геттеры и Сеттеры, Получаем доступ.");
        System.out.println("--------------------------------------------");
        Person person3 = new Person();
        person3.setName("");
        person3.setAge(-4);
        person3.speech();
        System.out.println("Выводим значение в main методе:" + person3.getName());
        System.out.println("Выводим значение в main методе:" + person3.getAge());
    }
}
//class test37{
//
//}
//class test2{
//
//}

class Person{
    // У класса Млгут Быть:
    // 1 - Данные (Поля).
    // 2 - Действия Которые Он Может Совершать (Методы.
    String name;  // Открытое Поле
    int age; // Открытое поле.
    private String login;
    private int years;
//    void calculateYearsToRetirement(){
//        int years = 65 - age;
//        System.out.println("Количество лет до пенсии: " + years);
//    }
    void setNameAndAge(String username, int userage){
        name = username;
        age = userage;
    }
    int calculateYearsToRetirement(){
        int years = 65 - age;
        return years;
    }
    void speek(){
        for(int i = 0; i<3; i++) {
            System.out.println("Меня зовут " + name
                    + ", " + "мне " + age + "лет.");
        }
    }
    void speech(){
        for(int i = 0; i<3; i++) {
            System.out.println("Меня зовут " + login
                    + ", " + "мне " + years + "лет.");
        }
    }
    void sayHello(){
        System.out.println("Привет");
    }

    // Сеттеры И Геттеры Для Имени:
    public void setName(String username){
        if (username.isEmpty()){
            System.out.println("Ты Ввел Пустое Имя.");
        } else {login = username;}
    }
    public String getName(){
        return login;
    }
    public void setAge(int userage){
        if (userage < 0){
            System.out.println("Возраст должен быть Положительным.");
        } else {years = userage;}
    }
    public int getAge(){
        return years;
    }
}
