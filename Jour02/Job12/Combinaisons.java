class Combinaisons {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                for (int k = 1; k <= 6; k++) {
                    total++;
                    System.out.println(i + ", " + j + ", " + k);
                }
            }
        }

        System.out.println("Nombre total de combinaisons posibles : " + total);
    }
}