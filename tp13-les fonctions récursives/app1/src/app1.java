import java.util.Scanner;

public class app1 {
    public static int lecture() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Entrez un entier n > 0 : ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Erreur : n doit être strictement positif!");
            }
        } while (n <= 0);
        return n;
    }
    
    public static int somme_rec(int n) {
        if (n == 1) {  
            return 1;
        } else {      
            return n + somme_rec(n - 1);
        }
    }
    
    
    public static void main(String[] args) {
        int n = lecture();
        int resultat = somme_rec(n);
        System.out.println("La somme des entiers de 1 à " + n + " est : " + resultat);
    }
}