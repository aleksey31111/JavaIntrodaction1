public class Lesson20ConstructorsStatic {
    public static void main(String[] args) {
        HumanConstructors human = new HumanConstructors();
        HumanConstructors human1 = new HumanConstructors("Bob");
        HumanConstructors human2 = new HumanConstructors("Tim", 19);
        human.setName("Tom");
        human.setAge(13);
        System.out.println("STATIC:");
        HumanConstructors.description ="Nice.";
        HumanConstructors.getDescription();
        human.getAllField();
        human1.getAllField();
        human2.getAllField();
        HumanConstructors human3 = new HumanConstructors("Denise",40);
        human3.description = "Bad";
        human3.getAllField();
        System.out.println("Изменяем Общий \"description\"");
        HumanConstructors.description = "Bad";
        human.getAllField();
//        human1.setName("Bob");
//        human1.setAge(40);
        System.out.println("Вывод Математичкских Конструкций: ");
        System.out.println(Math.pow(2,4));
        System.out.println(Math.PI);
        System.out.println("Вывод количества Людей: ");
        human.printNumberOfPeople();
        human1.printNumberOfPeople();
        human2.printNumberOfPeople();
        human3.printNumberOfPeople();
    }
}
class HumanConstructors{
    private String name;
    private int age;
    public static String description;
//    public static int x;
    public static final double PI = 3.14;
    private static int countPeople;
    public HumanConstructors(){
        System.out.println("Привет Из Первого Конструктора!");
        this.name = "Имя По Умолчанию";
        this.age = 0;
        System.out.println(name + " " + age);
        countPeople++;
    }
    public HumanConstructors(String name){
        System.out.println("Привет Из Второго Конструктора!!");
        this.name = name;
        this.age = 0;
        System.out.println(name + " "  + age);
        countPeople++;
    }
    public HumanConstructors(String name, int age){
        System.out.println("Привет Из Третьего Конструктора!!!");
        this.name = name;
        this.age = age;
        System.out.println(name + " " + age);
        countPeople++;
    }
    public void setName(String name){this.name = name;}
    public void setAge(int age){this.age = age;}
    public static void getDescription(){
        System.out.println("getDescription: "  +
                "...-static variable name cannot be referenced from a static context..."  +
                description);
    }
    public void getAllField(){
        System.out.println("getAllField: " + name + "," + age + "," + description);
    }
    public static void printAllField(){
        System.out.println(description);
    }
    public void printNumberOfPeople(){
        System.out.println("Number Of Peaple Is: " + countPeople);
    }
}
