import java.util.Scanner;

public class app3 {
    
    // Méthode pour lire un entier strictement positif
    public static int lecture() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Entrez un entier N > 0 : ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Erreur : N doit être strictement positif!");
            }
        } while (n <= 0);
        return n;
    }
    
    // Méthode récursive pour vérifier si un nombre est premier
    public static boolean estPremier_rec(int n, int diviseur) {
        // Cas de base 1: diviseur atteint 1 (nombre premier)
        if (diviseur == 1) {
            return true;
        }
        // Cas de base 2: n est divisible par diviseur (non premier)
        if (n % diviseur == 0) {
            return false;
        }
        // Cas récursif: tester avec le diviseur suivant
        return estPremier_rec(n, diviseur - 1);
    }
    
    // Wrapper pour la méthode récursive (simplifie l'appel)
    public static boolean estPremier(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        return estPremier_rec(n, (int)Math.sqrt(n));
    }
    
    // Programme principal
    public static void main(String[] args) {
        int N = lecture();
        System.out.println("Nombres premiers inférieurs à " + N + " :");
        
        for (int i = 2; i < N; i++) {
            if (estPremier(i)) {
                System.out.print(i + " ");
            }
        }
    }
}