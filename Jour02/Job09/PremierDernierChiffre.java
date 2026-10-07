import java.util.Scanner; 

class PremierDernierChiffre {
    public static void main(String[] args) {
        int numero;
        Scanner saisie = new Scanner(System.in);
        System.out.println("Entrez votre nombre :");
        numero = saisie.nextInt(); // pour lire le nombre entier saisi
        String chaine = Integer.toString(numero); // on convertit en string
        String premierCaractere, dernierCaractere;
        premierCaractere = chaine.substring(0, 1);
        dernierCaractere = chaine.substring(chaine.length() - 1);
        System.out.println("Le premier chiffre de " + chaine + " est : " + premierCaractere);
        System.out.println("Le dernier chiffre de " + chaine + " est : " + dernierCaractere);
    }
}