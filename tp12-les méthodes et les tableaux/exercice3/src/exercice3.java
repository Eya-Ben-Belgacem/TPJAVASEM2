  
import java.util.Scanner;
import java.util.ArrayList;

public class exercice3 {
    public static int lecturexN() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Entrez la taille du tableau (n > 0): ");
            n = scanner.nextInt();
        } while (n <= 0);
        return n;
    }
    
    public static void RemplirTAb(int[] T) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < T.length; i++) {
            do {
                System.out.print("Entrez l'élément " + (i+1) + " (=0): ");
                T[i] = scanner.nextInt();
            } while (T[i] < 0);
        }
    }
    
    public static ArrayList<Integer> CreerTpair(int[] T) {
        ArrayList<Integer> pairs = new ArrayList<>();
        for (int num : T) {
            if (num % 2 == 0) {
                pairs.add(num);
            }
        }
        return pairs;
    }
    
    public static ArrayList<Integer> CreerTimpair(int[] T) {
        ArrayList<Integer> impairs = new ArrayList<>();
        for (int num : T) {
            if (num % 2 != 0) {
                impairs.add(num);
            }
        }
        return impairs;
    }
    public static void AfficherTAb(ArrayList<Integer> liste) {
        System.out.print("Éléments: ");
        for (int num : liste) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int n = lecturexN();
        int[] T = new int[n];
        
        RemplirTAb(T);
        
        ArrayList<Integer> pairs = CreerTpair(T);
        ArrayList<Integer> impairs = CreerTimpair(T);
        
        System.out.println("\nRésultats:");
        System.out.print("Nombres pairs: ");
        AfficherTAb(pairs);
        
        System.out.print("Nombres impairs: ");
        AfficherTAb(impairs);
    }
}