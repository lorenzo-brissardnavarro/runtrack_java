import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Tableau {

    public static boolean doublon(int[] tab, boolean[] tab2, int index) {
        int valeur = tab[index];
        boolean verdict = true;
        for (int j = index+1 ; j < tab.length ; j++) {
            if (valeur == tab[j]) {
                tab2[j] = true;
                verdict = false;
                break;
            }
        }
        return verdict;
    }

    public static void main(String[] args) {
        int[] monTableau = {3, 7, 3, 9, 8, 9, 5};
        ArrayList<Integer> uniqueTab = new ArrayList<>();
        boolean[] dejaCompte = new boolean[monTableau.length];
        System.out.println("Tableau au départ : " + Arrays.toString(monTableau));
        for (int i = 0 ; i < monTableau.length ; i++) {
            if (dejaCompte[i]) {
                continue;
            }
            if (Tableau.doublon(monTableau, dejaCompte, i)) {
                uniqueTab.add(monTableau[i]);
            }
        }
        System.out.println("Tableau des valeurs uniques : " + uniqueTab);
    }

    
}
