import java.util.Scanner; 

class Triangle {
    public static void main(String[] args) {
        int hauteur;
        Scanner saisie = new Scanner(System.in);
        System.out.println("Entrez votre nombre :");
        hauteur = saisie.nextInt(); // pour lire le nombre entier saisi
        String chaine = "";
        for (int i = 1 ; i <= hauteur+1 ; i++) {
            chaine = "";
            for (int j = 1 ; j < i ; j++) {
                chaine += "*";
            }
            System.out.println(chaine);
        }
    }
}