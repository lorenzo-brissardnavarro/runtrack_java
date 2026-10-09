import java.util.Random;

class JeuDeDes {
    private int de1, de2;

    public JeuDeDes() {
        this.de1 = 0;
        this.de2 = 0;
    }

    public void lancerDes() {
        Random randomNumbers = new Random();
        this.de1 = randomNumbers.nextInt(6) + 1;
        this.de2 = randomNumbers.nextInt(6) + 1;
    }

    public int somme(){
        return this.de1 + this.de2;
    }

    public int getDe1() {
        return this.de1;
    }

    public int getDe2() {
        return this.de2;
    }
    
}


public class Main {
    public static void main(String[] args) {
        JeuDeDes monJeuDeDes = new JeuDeDes();
        monJeuDeDes.lancerDes();
        System.out.println("Dé 1 : " + monJeuDeDes.getDe1());
        System.out.println("Dé 2 : " + monJeuDeDes.getDe2());
        System.out.println("Somme : " + monJeuDeDes.somme());
    }
}