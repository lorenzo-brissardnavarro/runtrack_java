import java.util.Arrays;

class Tableau {
    public static void main(String[] args) {
        String[] monTableau = {"Josette", "John", "Myrtille", "Marc"};
        System.out.println("Au départ : " + Arrays.toString(monTableau));
        System.out.println("Valeur John : " + monTableau[1]);
        monTableau[2] = "Mireille";
        System.out.println("Après modif, le tableau ressemble à : " + Arrays.toString(monTableau));
    }
}