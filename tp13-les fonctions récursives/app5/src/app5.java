import java.util.Scanner;

public class app5 {
    public static String Lecture() {
        Scanner sc = new Scanner(System.in);
        String ch;
        do {
            System.out.print("Entrez une chaîne de caractères (max 50): ");
            ch = sc.nextLine();
            if (ch.length() > 50) {
                System.out.println("La chaîne est trop longue (max 50 caractères)");
            }
        } while (ch.length() > 50);
        return ch;
    }
    public static int Nbr_Occ_rec(String mot, char car) {
        if (mot.isEmpty()) {
            return 0;
        }
        return (mot.charAt(0) == car ? 1 : 0) + Nbr_Occ_rec(mot.substring(1), car);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch = Lecture();
        
        System.out.print("Entrez un caractère à rechercher: ");
        char car = sc.next().charAt(0);
        
     
        int occurrences = Nbr_Occ_rec(ch, car);
        System.out.println("Le caractère '" + car + "' apparaît " + occurrences + " fois dans \"" + ch + "\"");
    }
}