import java.util.Scanner; 

class SaisieUtilisateur {
    public static void main(String[] args) {
        String prenom, nom;
        Scanner saisie = new Scanner(System.in);
        System.out.println("Veuillez saisir le prenom :");
        prenom = saisie.nextLine(); // pour lire la chaine de caracteres sinon nextInt par exemple
        System.out.println("Veuillez saisir le nom :");
        nom = saisie.nextLine();
        System.out.println("Vous vous appelez " + prenom + " " + nom);
        saisie.close();
    }
}