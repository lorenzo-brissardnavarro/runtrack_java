import java.util.Arrays;

class Tableau {
    public static void main(String[] args) {
        int[][] matrice1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] matrice2 = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        int total = 0;
        System.out.println("Matrice 1 : " + Arrays.deepToString(matrice1));
        System.out.println("Matrice 1 : " + Arrays.deepToString(matrice2));

        for (int i = 0; i < matrice1.length; i++) {
            for (int j = 0; j < matrice1[i].length; j++) {
                total += matrice1[i][j];
            }
        }

        for (int i = 0; i < matrice2.length; i++) {
            for (int j = 0; j < matrice2[i].length; j++) {
                total += matrice2[i][j];
            }
        }
        System.out.println("Le total des 2 matrices donne : " + total);
    }
}