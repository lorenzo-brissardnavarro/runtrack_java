public class Somme {
    public static int additionner(int nb1, int nb2) {
        return nb1 + nb2;
    }

    public static void main(String[] args) {
        int somme = Somme.additionner(5, 3);
        System.out.println("3 + 5 = " + somme);
    }
}