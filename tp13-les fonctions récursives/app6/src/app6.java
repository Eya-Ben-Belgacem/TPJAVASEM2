import java.util.Scanner;

public class app6 {
    public static int lecture() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Entrez la taille du tableau (n > 0): ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("La taille doit être strictement positive");
            }
        } while (n <= 0);
        return n;
    }
    public static int[] RemplirTab(int n) {
        Scanner sc = new Scanner(System.in);
        int[] tab = new int[n];
        System.out.println("Remplissage du tableau:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i+1) + ": ");
            tab[i] = sc.nextInt();
        }
        return tab;
    }
    public static int SommeTab_rec(int[] tab, int index) {
        if (index == 0) {
            return tab[0];
        }
        return tab[index] + SommeTab_rec(tab, index - 1);
    }
    
    public static void main(String[] args) {
        int n = lecture();
        int[] tab = RemplirTab(n);
        int somme = SommeTab_rec(tab, n - 1);
        System.out.println("La somme des éléments du tableau est: " + somme);
    }
}