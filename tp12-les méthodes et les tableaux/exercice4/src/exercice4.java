import java.util.Scanner;

public class exercice4 {
    public static int lecturexN(String message) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print(message);
            n = scanner.nextInt();
        } while (n <= 0);
        return n;
    }
    
    public static void RemplirTAb(double[][] M) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print("M[" + i + "][" + j + "] = ");
                M[i][j] = scanner.nextDouble();
            }
        }
    }
    public static double CalculSomme(double[] ligne) {
        double somme = 0;
        for (double valeur : ligne) {
            somme += valeur;
        }
        return somme;
    }
    
    public static void main(String[] args) {
        int n1 = lecturexN("Nombre de lignes (n1 > 0): ");
        int n2 = lecturexN("Nombre de colonnes (n2 > 0): ");
        
        double[][] M = new double[n1][n2];
        RemplirTAb(M);
        
        System.out.println("\nSommes par ligne:");
        for (int i = 0; i < n1; i++) {
            double somme = CalculSomme(M[i]);
            System.out.println("Ligne " + i + ": " + somme);
        }
    }
}