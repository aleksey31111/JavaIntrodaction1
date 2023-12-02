public class Arrays_of_Strings {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        System.out.print(numbers[0] + " " + numbers[1] + " " +
                numbers[2] + " " + numbers[3] + " " + numbers[4]);
        System.out.println();
        String[] strings = new String[3];
        strings[0] = "Привет";
        strings[1] = "Пока";
        strings[2] = "java";
        System.out.print(strings[0] + " " + strings[2] + " !");
        System.out.println();

        for (int i = 0; i<strings.length; i++){
            System.out.print(strings[i]);
            System.out.print(" ");
        }
        System.out.println();
        for (String string:strings){  // Цикл for each
            System.out.print(string + " ");
        }
        System.out.println();

        int[] numbers1 = {1,2,3};
        int sum = 0;
        for(int x:numbers1){  // Цикл for each
            sum = sum + x;
        }
        System.out.println(sum);

        int value = 0;
        String s = "Адресс Дома \"s\"";
        System.out.println(s);
    }
}
