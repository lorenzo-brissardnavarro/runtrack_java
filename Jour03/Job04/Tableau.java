import java.util.Arrays;

class Tableau {
    public static int compterOccurrence(int[] tab, boolean[] tab2, int index) {
        int compteur = 1;
        for (int i = index+1 ; i < tab.length ; i++) {
            if (tab[i] == tab[index]) {
                compteur++;
                tab2[i] = true;
            }
        }
        return compteur;
    }

    public static void main(String[] args) {
        int[] monTableau = {3, 7, 3, 9, 8};
        boolean[] dejaCompte = new boolean[monTableau.length];
        System.out.println("Tableau au départ : " + Arrays.toString(monTableau));
        for (int i = 0 ; i < monTableau.length ; i++) {
            if (dejaCompte[i]) {
                continue;
            }
            System.out.println("Le chiffre " + monTableau[i] + " apparaît " + Tableau.compterOccurrence(monTableau, dejaCompte, i) + " fois");
        }
    }

    
}
