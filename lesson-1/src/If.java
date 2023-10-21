public class If {
    public static void main(String[] args) {
        if(5<4){
            System.out.print("Да, верно.");
            System.out.println();
        }
        else{
            System.out.print("Нет, не верно.");
            System.out.println();
        }
        int myInt = 15;
        if(myInt < 10){
            System.out.println("Да, верно. myInt");
        }else if(myInt>20){
            System.out.println("Нет, не верно. myInt");
        }else {
            System.out.println("Ни один из предыдущих случаев. myInt");
        }
        int myInt1 = 5;
        if(myInt1 < 10){
            System.out.println("Да, верно. myInt1");
        }else if(myInt1 < 20){
            System.out.println("Нет, не верно. myInt1");
        }
    }
}
