public class Lesson22final {
    public static void main(String[] args) {
//        Test.CONSTANT = 10; Не Можем Так Дел=лать
        final int X = 10;
        System.out.println(X);
//        X = 5; // Мы Не Можем Так Делать.
    }
}
class Test{
//    public final int CONSTANT;
//    public Test(int CONSTANT){
//        this.CONSTANT = CONSTANT;
//    }
//    public void setCONSTANT(int x){  // Мы Не
//        this.CONSTANT = x;  //  Можем Назначить
//    }  // Переменные final(Константы) в "Сеттерах".
    public static final int CONSTANT = 0;
}