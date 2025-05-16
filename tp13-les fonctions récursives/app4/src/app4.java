import java.util.Scanner;

public class app4 {
    
    // M�thode pour lire une cha�ne de max 30 caract�res
    public static String lecture() {
        Scanner scanner = new Scanner(System.in);
        String ch;
        do {
            System.out.print("Entrez une cha�ne (max 30 caract�res) : ");
            ch = scanner.nextLine();
            if (ch.length() > 30) {
                System.out.println("Erreur : la cha�ne ne doit pas d�passer 30 caract�res!");
            }
        } while (ch.length() > 30);
        return ch;
    }
    
    // M�thode r�cursive pour v�rifier si une cha�ne est un palindrome
    public static boolean palindrome_rec(String ch, int debut, int fin) {
        // Cas de base 1: un seul caract�re ou indices crois�s
        if (debut >= fin) {
            return true;
        }
        // Cas de base 2: caract�res diff�rents
        if (ch.charAt(debut) != ch.charAt(fin)) {
            return false;
        }
        // Cas r�cursif: v�rifier les caract�res suivants
        return palindrome_rec(ch, debut + 1, fin - 1);
    }
    
    // Wrapper pour la m�thode r�cursive
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