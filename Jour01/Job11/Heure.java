import java.util.Scanner; 

class Heure {
    public static void main(String[] args) {
        int nb, heures, minutes;
        Scanner saisie = new Scanner(System.in);
        System.out.println("Entrez une durée en minutes :");
        nb = saisie.nextInt(); // pour lire le nombre entier saisi
        heures = nb / 60;
        minutes = nb % 60;
        System.out.println(nb + " minutes est équivalent à " + heures + " heures et " + minutes + " minutes");
    }
}