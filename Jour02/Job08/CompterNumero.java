import java.util.Scanner; 

class CompterNumero {
    public static void main(String[] args) {
        int numero;
        Scanner saisie = new Scanner(System.in);
        System.out.println("Entrez votre nombre :");
        numero = saisie.nextInt(); // pour lire le nombre entier saisi
        String chaine = Integer.toString(numero); // on convertit en string
        System.out.println("Dans " + chaine + " on trouve " + chaine.length() + " chiffre(s)");
    }
}