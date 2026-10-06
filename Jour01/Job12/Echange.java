import java.util.Scanner; 

class Echange {
    public static void main(String[] args) {
        String chaine1, chaine2;
        Scanner saisie = new Scanner(System.in);
        System.out.println("Veuillez saisir la première chaine de caractères :");
        chaine1 = saisie.nextLine(); // pour lire la chaine de caracteres sinon nextInt par exemple
        System.out.println("Veuillez saisir la deuxième chaine de caractères :");
        chaine2 = saisie.nextLine();
        System.out.println("Valeur de la 1ère chaine : '" + chaine1 + "' et valeur de la 2ème chaine : '" + chaine2 + "'");
        System.out.println("Après échange : ");
        chaine1 += chaine2;
        chaine2 = chaine1.substring(0, chaine1.length() - chaine2.length());
        chaine1 = chaine1.substring(chaine2.length());
        System.out.println("Valeur de la 1ère chaine : '" + chaine1 + "' et valeur de la 2ème chaine : '" + chaine2 + "'");
        saisie.close();
    }
}