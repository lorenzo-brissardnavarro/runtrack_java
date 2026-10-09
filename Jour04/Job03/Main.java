import java.util.Scanner; 

class Calculatrice {
    double nb1, nb2;

    Calculatrice(double nb1, double nb2) {
        this.nb1 = nb1;
        this.nb2 = nb2;
    }

    double additionner() {
        return this.nb1 + this.nb2;
    }

    double soustraire() {
        return this.nb1 - this.nb2;
    }

    double multiplier() {
        return this.nb1 * this.nb2;
    }

    double diviser() {
        return this.nb1 / this.nb2;
    }
    
}


public class Main {
    public static void main(String[] args) {
        double nb1, nb2;
        Scanner saisie = new Scanner(System.in);
        System.out.println("Entrez le premier nombre :");
        nb1 = saisie.nextDouble();
        System.out.println("Entrez le deuxième nombre :");
        nb2 = saisie.nextDouble();
        saisie.close();
        Calculatrice maCalculatrice = new Calculatrice(nb1, nb2);
        System.out.println("Somme : " + maCalculatrice.additionner());
        System.out.println("Différence : " + maCalculatrice.soustraire());
        System.out.println("Produit : " + maCalculatrice.multiplier());
        System.out.println("Division : " + maCalculatrice.diviser());
    }
}