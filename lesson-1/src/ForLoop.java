public class ForLoop {
    public static void main(String[] args) {
        for(int i = 0; i<=10; i++){ // i++ = i=i+1
            System.out.print("Hello! " + i + "  ");
        }
        System.out.println();
        for(int i = 0; i<=10; i = i+5){
            System.out.print("Hello!! " + i + "  ");
        }
        System.out.println();
        for (int i = 10; i >= 0; i--){
            System.out.print("Hello!!! " + i + "  ");
        }
        System.out.println();
        for(int i = 10; i >= 0; i = i-5){
            System.out.print("Hello!!!! " + i + "  ");
        }
    }
}
