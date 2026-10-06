class ExerciceVariables {
    public static void main(String[] args) {
        int nb1 = 5, nb2 = 10;
        System.out.println("La valeur de nb1 est " + nb1 + " et la valeur de nb2 est " + nb2);
        int temp = nb1;
        nb1 = nb2;
        nb2 = temp;
        System.out.println("La valeur de nb1 est " + nb1 + " et la valeur de nb2 est " + nb2);
    }
}