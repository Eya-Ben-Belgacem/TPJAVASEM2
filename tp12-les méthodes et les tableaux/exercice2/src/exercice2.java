import java.util.Scanner;

public class exercice2 {
    public static int lecturexN() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Entrez le nombre d'élèves (1-10): ");
            n = scanner.nextInt();
        } while (n < 1 || n > 10);
        return n;
    }
    
    public static void RemplirTAb(double[] notes) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < notes.length; i++) {
            do {
                System.out.print("Note élève " + (i+1) + " (0-20): ");
                notes[i] = scanner.nextDouble();
            } while (notes[i] < 0 || notes[i] > 20);
        }
    }
    
    public static double Calcul_Moy(double[] notes) {
        double somme = 0;
        for (double note : notes) {
            somme += note;
        }
        return somme / notes.length;
    }
    
    public static int NombreNote(double[] notes, double moyenne) {
        int count = 0;
        for (double note : notes) {
            if (note > moyenne) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
       
        int n = lecturexN();
        double[] notes = new double[n];
        
        RemplirTAb(notes);
        double moyenne = Calcul_Moy(notes);
        int nbSupMoy = NombreNote(notes, moyenne);
        
        System.out.println("\nRésultats:");
        System.out.println("Moyenne de la classe: " + moyenne);
        System.out.println("Nombre de notes supérieures à la moyenne: " + nbSupMoy);
    }
}