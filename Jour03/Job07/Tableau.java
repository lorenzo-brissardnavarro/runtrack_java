import java.util.Arrays;

class Tableau {

    public static int calculMatrice(int[][] matrice) {
        int total = 0;
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                total += matrice[i][j];
            }
        }
        return total;
    }

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
        
        System.out.println("Matrice 1 : " + Arrays.deepToString(matrice1));
        System.out.println("Matrice 1 : " + Arrays.deepToString(matrice2));

        int total = Tableau.calculMatrice(matrice1) + Tableau.calculMatrice(matrice2);
        System.out.println("Le total des 2 matrices donne : " + total);
    }
}