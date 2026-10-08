import java.util.Arrays;

class Tableau {
    public static void main(String[] args) {
        int[] tableau = new int[5]; // création du tableau sans valeurs
        tableau[0] = 10;
        tableau[2] = 2;
        tableau[4] = 69;
        System.out.println("La valeur de l'index 1 = " + tableau[1]); 
        System.out.println(Arrays.toString(tableau));

    }
}