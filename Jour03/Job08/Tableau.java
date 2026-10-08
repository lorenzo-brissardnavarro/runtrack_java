import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
class Tableau {
    public static void main(String[] args) {
        int[][] tableau = {
            {5, 9, 3},
            {7, 2, 8},
            {1, 6, 4}
        };
        System.out.println("Tableau : " + Arrays.deepToString(tableau));

        ArrayList<Integer> autreTab = new ArrayList<>();
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                autreTab.add(tableau[i][j]);
            }
        }

        autreTab.sort(null);

        int index = 0;
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                tableau[i][j] = autreTab.get(index);
                index++;
            }
        }
        System.out.println("Tableau trié : " + Arrays.deepToString(tableau));
    }
}