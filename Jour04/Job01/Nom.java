import java.util.Scanner; 

class Nom {
    public static void main(String[] args) {
        String prenom;
        Scanner saisie = new Scanner(System.in);
        System.out.println("Veuillez saisir votre nom :");
        prenom = saisie.nextLine();
        System.out.println("Hello, " + prenom + " !");
        saisie.close();
    }
}