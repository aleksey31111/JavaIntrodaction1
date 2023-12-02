public class Arrays {
    public static void main(String[] args) {
        int number = 10;  // Примитивный тип Данных. Коробка [10].
//        char character = 'a';  //  // Примитивный тип Данных. Коробка.
//        String s = "Hello";  // Ссылщчный тип Данных.
//        String s1 = new String("Hello")  // Ссылочный тип Данных.
        int[] numbers = new int[5]; //  numbers -> [массив] Ссылочный тип Данных.
        System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2] + " " +
                            numbers[3] + " " + numbers[4] + " "); // 0 1 2 3 4
//                + numbers[5] + numbers[6] + " " + numbers[7] + " " + numbers[8] + numbers[9]);
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2] + " " +
                            numbers[3] + " " + numbers[4] + " ");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i*10;
        }
        for (int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        int[] numbers1 = {1, 2, 3};
        for (int i = 0; i<numbers1.length; i++){
            System.out.print(numbers1[i] + " ");
        }
    }
}
