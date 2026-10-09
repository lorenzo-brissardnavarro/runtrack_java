class Forme {

    public double aire() {
        return 0;
    }
}

class Cercle extends Forme {

    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double aire() {
        double valeur = Math.PI * this.rayon * this.rayon;
        return Math.round(valeur * 100.0) / 100.0;
    }
}

class Carre extends Forme {

    private double cote;

    public Carre(double cote) {
        this.cote = cote;
    }

    @Override
    public double aire() {
        return this.cote * this.cote;
    }
}

public class Main {
    public static void main(String[] args) {
        Forme monCercle = new Cercle(5);
        Forme monCarre = new Carre(4);
        System.out.println("Aire du cercle de rayon 5 : " + monCercle.aire());
        System.out.println("Aire du carré de côté 4 : " + monCarre.aire());
    }
}