import java.util.Scanner; 

class VerifAge {
    public static void main(String[] args) {
        int age;
        Scanner saisie = new Scanner(System.in);
        System.out.println("Entrez votre âge :");
        age = saisie.nextInt(); // pour lire le nombre entier saisi
        do {
            System.out.println("L'âge saisi doit être supérieur à 0, merci d'en saisir un valide :");
            age = saisie.nextInt(); // pour lire le nombre entier saisi
        } while (age < 1);
        if (age < 16) {
            System.out.println("Vous ne pouvez pas encore travailler");
        } else if (age > 67) {
            System.out.println("Vous êtes à la retraite");
        } else if (age > 55) {
            System.out.println("Vous aurez du mal à trouver un emploi");
        } else {
            System.out.println("Vous pouvez travailler !");
        }
    }
}