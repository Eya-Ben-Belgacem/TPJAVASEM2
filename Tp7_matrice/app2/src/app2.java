
public class app2 {
    
    public static void main(String[] args) {
        int[][] M1 = new int[20][30];
        int nl, nc, i, j, s1 = 0, p1 = 1;
        double moyenne;
        do {
            System.out.print("Entrer le nombre de lignes: ");
            nl = Clavier.lireInt();
        } while (nl <= 0 || nl > 20);
        System.out.println("La valeur de nl est: " + nl);

        do {
            System.out.print("Entrer le nombre de colonnes: ");
            nc = Clavier.lireInt();
        } while (nc <= 0 || nc > 30);
        System.out.println("La valeur de nc est: " + nc);

        for (i = 0; i < nl; i++) {
            for (j = 0; j < nc; j++) {
                System.out.print("Remplir M1[" + i + "," + j + "]: ");
                M1[i][j] = Clavier.lireInt();
                s1 += M1[i][j];
                p1 *= M1[i][j];
            }
        }

        moyenne = (double) s1 / (nl * nc);

        System.out.println("La somme des elements du tableau est: " + s1);
        System.out.println("Le produit des elements du tableau est: " + p1);
        System.out.println("La moyenne des elements du tableau est: " + moyenne);
    }
}