public class Lesson19this {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setAge(18);
        human1.setName("Tom");
        human1.getInfo();
        Human human2 = new Human();
        human2.setAge(23);
        human2.setName("Boris");
        human2.getInfo();
    }
}
class  Human{
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }
    public void getInfo(){
        System.out.println(name + ", " + age + ".");
    }
}
