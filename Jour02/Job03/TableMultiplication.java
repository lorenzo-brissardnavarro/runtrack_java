import java.util.Scanner; 

class TableMultiplication {
    public static void main(String[] args) {
        int nb;
        Scanner saisie = new Scanner(System.in);
        System.out.println("Entrez votre nombre :");
        nb = saisie.nextInt(); // pour lire le nombre entier saisi
        for (int i = 0 ; i <= 10 ; i++){
            System.out.println(i + " X " + nb + " = " + i * nb);
        }
    }
}