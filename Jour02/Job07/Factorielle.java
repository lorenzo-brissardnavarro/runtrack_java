import java.util.Scanner; 

class Factorielle {
    public static void main(String[] args) {
        int nb, total = 1;
        Scanner saisie = new Scanner(System.in);
        System.out.println("Entrez votre nombre :");
        nb = saisie.nextInt(); // pour lire le nombre entier saisi
        while (nb < 0) {
            System.out.println("Le nombre saisi ne doit pas être négatif, merci d'en saisir un valide :");
            nb = saisie.nextInt(); // pour lire le nombre entier saisi
        }

        for (int i = 1 ; i <= nb ; i++) {
            total *= i;
        }
        System.out.println("La factorielle du nombre " + nb + " est : " + total);
    }
}