import java.util.Arrays;

class Tableau {
    public static void main(String[] args) {
        int[] monTableau = {12,6,76,89};
        System.out.println("Tableau au départ : " + Arrays.toString(monTableau));
        for (int i = 0 ; i < monTableau.length ; i++) {
            monTableau[i] = i;
        }
        System.out.println("Après modif : " + Arrays.toString(monTableau));
    }
}