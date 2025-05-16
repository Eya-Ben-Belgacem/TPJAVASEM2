import java.util.Scanner;

public class app2 {
    public static int lecture() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Entrez un entier strictement positif : ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Erreur : l'entier doit être strictement positif!");
            }
        } while (n <= 0);
        return n;
    }
    
    public static long factoriel_rec(int n) {
        if (n == 1) {  
            return 1;
        } else {      
            return n * factoriel_rec(n - 1);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Combien de nombres voulez-vous traiter ? ");
        int N = scanner.nextInt();
        
        for (int i = 0; i < N; i++) {
            int nombre = lecture();
            long fact = factoriel_rec(nombre);
            System.out.println("Le factoriel de " + nombre + " est : " + fact);
        }
    }
}