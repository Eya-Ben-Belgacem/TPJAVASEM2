import java.util.Scanner;

public class exercice_palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une chaîne de caractères : ");
        String ch = scanner.nextLine();
        if (estPalindrome(ch)) {
            System.out.println("\"" + ch + "\" est un palindrome.");
        } else {
            System.out.println("\"" + ch + "\" n'est pas un palindrome.");
        }

        scanner.close();
    }

    public static boolean estPalindrome(String ch) {
        ch = ch.replaceAll("\\s", "").toLowerCase();
        int longueur = ch.length();
        for (int i = 0; i < longueur / 2; i++) {
            if (ch.charAt(i) != ch.charAt(longueur - 1 - i)) {
                return false; 
            }
        }
        return true; 
    }
}