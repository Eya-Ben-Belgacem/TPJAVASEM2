import java.util.Scanner;

public class app4 {
    
    // Méthode pour lire une chaîne de max 30 caractères
    public static String lecture() {
        Scanner scanner = new Scanner(System.in);
        String ch;
        do {
            System.out.print("Entrez une chaîne (max 30 caractères) : ");
            ch = scanner.nextLine();
            if (ch.length() > 30) {
                System.out.println("Erreur : la chaîne ne doit pas dépasser 30 caractères!");
            }
        } while (ch.length() > 30);
        return ch;
    }
    
    // Méthode récursive pour vérifier si une chaîne est un palindrome
    public static boolean palindrome_rec(String ch, int debut, int fin) {
        // Cas de base 1: un seul caractère ou indices croisés
        if (debut >= fin) {
            return true;
        }
        // Cas de base 2: caractères différents
        if (ch.charAt(debut) != ch.charAt(fin)) {
            return false;
        }
        // Cas récursif: vérifier les caractères suivants
        return palindrome_rec(ch, debut + 1, fin - 1);
    }
    
    // Wrapper pour la méthode récursive
    public static boolean estPalindrome(String ch) {
        if (ch == null || ch.isEmpty()) {
            return true;
        }
        return palindrome_rec(ch, 0, ch.length() - 1);
    }
    
    // Programme principal
    public static void main(String[] args) {
        String chaine = lecture();
        if (estPalindrome(chaine)) {
            System.out.println("\"" + chaine + "\" est un palindrome.");
        } else {
            System.out.println("\"" + chaine + "\" n'est pas un palindrome.");
        }
    }
}