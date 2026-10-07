import java.util.Scanner; 

class SommeChiffres {
    public static void main(String[] args) {
        int numero, total = 0;
        Scanner saisie = new Scanner(System.in);
        System.out.println("Entrez votre nombre :");
        numero = saisie.nextInt(); // pour lire le nombre entier saisi
        String chaine = Integer.toString(numero); // on convertit en string
        for (int i = 0 ; i < chaine.length() ; i++) {
            total += Character.getNumericValue(chaine.charAt(i));
        }
        System.out.println("La somme des chiffres est : " + total);
    }
}