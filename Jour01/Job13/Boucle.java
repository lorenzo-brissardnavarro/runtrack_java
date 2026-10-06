import java.util.Scanner; 

class Boucle {
    public static void main(String[] args) {
        int nb = 0;
        Scanner saisie = new Scanner(System.in);
        System.out.println("Entrez votre nombre :");
        nb = saisie.nextInt(); // pour lire le nombre entier saisi
        do {
            System.out.println("Votre nombre est inférieur à 1, merci d'en saisir un autre :");
            nb = saisie.nextInt(); // pour lire le nombre entier saisi
        } while (nb < 1);
        System.out.println("Début des nombres : ");
        for (int i = 1; i <= nb; i++) {
            System.out.println(i);
        }
        saisie.close();
    }
}