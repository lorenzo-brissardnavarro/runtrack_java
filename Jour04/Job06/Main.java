import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Etudiant {
    private String prenom;
    private ArrayList<Integer> notes;

    public Etudiant(String prenom, int[] tableau) {
        this.prenom = prenom;
        this.notes = new ArrayList<>();

        for (int valeur : tableau) {
            this.notes.add(valeur);
        }
    }

    public void getPrenom() {
        System.out.println("Prénom de l'étudiant : " + this.prenom);
    }

    public void getNotes() {
        System.out.println("Notes : " + this.notes);
    }

    public double moyenne() {
        int total = 0;
        for (int i = 0 ; i < this.notes.size() ; i++) {
            total += this.notes.get(i);
        }
        return (double) total / this.notes.size();
    }

    public int maximum() {
        int max = this.notes.get(0);
        for (int i = 0 ; i < this.notes.size() ; i++) {
            if (this.notes.get(i) > max) {
                max = this.notes.get(i);
            }
        }
        return max;
    }

    public int minimum() {
        int min = this.notes.get(0);
        for (int i = 0 ; i < this.notes.size() ; i++) {
            if (this.notes.get(i) < min) {
                min = this.notes.get(i);
            }
        }
        return min;
    }

    public void ajoutNote(int valeur) {
        this.notes.add(valeur);
    }
    
}


public class Main {
    public static void main(String[] args) {
        int[] monTableau = {15, 12, 18, 10};
        Etudiant bob = new Etudiant("Bob", monTableau);
        bob.getPrenom();
        bob.getNotes();
        System.out.println("Note la plus haute : " + bob.maximum());
        System.out.println("Note la plus basse : " + bob.minimum());
        System.out.println("Moyenne : " + bob.moyenne());
        bob.ajoutNote(17);
        bob.getNotes();
    }
}