public class Multidimensional_arrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2]);

        /*
         * 1,2,3,4,5,0,-1,-2
         *
         * 156
         * 376 [1][1]
         * 268
        */
        int[][] matrice = {{1,2,3},
                            {4,5,6},
                            {7,8,9}};
        System.out.println(matrice[2][2] + " " + matrice[1][0]);

        int[][] matrice1 = {{1,2,3,4,5},
                {4},
                {7,8}};
        System.out.println(matrice1[0][4] + " " + matrice1[1][0] + " " + matrice1[2][1]);

        int[] numbers2 = new int[6]; // Инициализация массива

        String[][] strings = new String[2][3];
        strings[0][1] = "Привет!";
        System.out.println(strings[0][1]);

        for (int i = 0; i<matrice.length; i++){
            for (int j = 0; j<matrice[i].length; j++){
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(strings[0][1]);

        for (int i = 0; i<matrice1.length; i++){
            for (int j = 0; j<matrice1[i].length; j++){
                System.out.print(matrice1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
