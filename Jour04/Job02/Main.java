class Voiture {
    String marque;
    String couleur;
    int vitesse;

    Voiture(String marque, String couleur) {
        this.marque = marque;
        this.couleur = couleur;
        this.vitesse = 0;
    }

    void demarrer() {
        System.out.println("La voiture démarre");
    }

    void accelerer() {
        this.vitesse += 10;
        System.out.println("La vitesse est maintenant de " + this.vitesse + " km/h.");
    }

    void freiner() {
        this.vitesse = 0;
        System.out.println("La voiture s'arrête. Vitesse réinitialisée à " + this.vitesse + " km/h.");
    }
    
}


public class Main {
    public static void main(String[] args) {
        Voiture maVoiture = new Voiture("Toyota", "Blanc");
        maVoiture.demarrer();
        maVoiture.accelerer();
        maVoiture.accelerer();
        maVoiture.freiner();
    }
}