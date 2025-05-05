import java.util.Scanner;

public class methode1 {
    static Scanner scanner = new Scanner(System.in); 
    
    public static int lectureN() {
        int n;
        do {
            System.out.println("Donner un entier strictement positif");
            while (!scanner.hasNextInt()) {
                System.out.println("erreur");
                scanner.next(); 
            }
            n = scanner.nextInt();
        } while (n <= 0);
        return n;
    }

    public static void RemplirTab(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print("T[" + i + "] = ");
            tab[i] = scanner.nextInt();
        }
    }

    public static void Remplacer(int[] tab, int x1, int x2) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == x1) {
                tab[i] = x2;
            }
        }
    }

    public static void AfficheTab(int[] tab) {
        System.out.print("Contenu du tableau : ");
        for (int val : tab) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}