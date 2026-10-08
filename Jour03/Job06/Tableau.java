import java.util.Arrays;
import java.util.Random;

class Tableau {
    public static void main(String[] args) {
        Random randomNumbers = new Random();
        int[] monTableau = new int[10];
        System.out.println("Tableau au départ : " + Arrays.toString(monTableau));
        for (int i = 0 ; i < monTableau.length ; i++) {
            monTableau[i] = randomNumbers.nextInt(25); // nombre aléatoire jusqu'à 25
        }
        System.out.println("Après modif : " + Arrays.toString(monTableau));
    }
}