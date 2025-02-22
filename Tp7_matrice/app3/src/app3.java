
public class app3 {

    public static void main(String[] args) {
        int[][] M1 = new int[20][30];
        int[] T = new int[20]; 
        int nl, nc, i, j, s1;
        int min, max;
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
            s1 = 0; 
            for (j = 0; j < nc; j++) {
                System.out.print("Remplir M1[" + i + "," + j + "]: ");
                M1[i][j] = Clavier.lireInt();
                s1 += M1[i][j]; 
            }
            T[i] = s1; 
        }
        System.out.println("Sommes de chaque ligne :");
        for (i = 0; i < nl; i++) {
            System.out.println("Ligne " + i + " : " + T[i]);
        }
        min = T[0];
        max = T[0];
        for (i = 1; i < nl; i++) {
            if (T[i] < min) {
                min = T[i];
            }
            if (T[i] > max) {
                max = T[i];
            }
        }
        System.out.println("La somme minimale est : " + min);
        System.out.println("La somme maximale est : " + max);
    }
}