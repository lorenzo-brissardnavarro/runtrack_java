class CompteBancaire {
    int solde;

    CompteBancaire(int solde) {
        this.solde = solde;
    }

    void afficherSolde() {
        System.out.println("Solde actuel : " + this.solde + " euros");
    }

    void deposer(int montant) {
        this.solde += montant;
        System.out.println(montant + "euros déposés. Nouveau solde : " + this.solde + " euros");
    }

    void retirer(int montant) {
        if (this.solde - montant < 0) {
            System.out.println("Tentative de retrait de " + montant + " euros... Solde insuffisant !");
        } else {
            this.solde -= montant;
            System.out.println(montant + " euros retirés. Nouveau solde : " + this.solde + " euros");
        }
    }
    
}


public class Main {
    public static void main(String[] args) {
        CompteBancaire monCompteBancaire = new CompteBancaire(100);
        monCompteBancaire.afficherSolde();
        monCompteBancaire.deposer(50);
        monCompteBancaire.retirer(70);
        monCompteBancaire.retirer(90);
    }
}