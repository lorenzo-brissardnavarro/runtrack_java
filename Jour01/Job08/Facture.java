class Facture {
    public static void main(String[] args) {
        double prix = 49.99, tva = 0.2, tarifHT, tarifTVA, tarifTTC;
        int quantite = 3;
        tarifHT = prix * 3;
        tarifTVA = tarifHT * tva;
        tarifTTC = tarifHT + tarifTVA;
        System.out.println("Le montant total est : " + tarifHT);
        System.out.println("Le montant de la taxe est : " + tarifTVA);
        System.out.println("Le montant total est : " + tarifTTC);
    }
}