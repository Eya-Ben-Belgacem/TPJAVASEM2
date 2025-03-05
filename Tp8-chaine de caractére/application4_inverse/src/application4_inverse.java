import java.util.Scanner;

public class application4_inverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une chaîne de caractères : ");
        String Ch = scanner.nextLine();

        String ChInverse = inverserChaine(Ch);

        System.out.println("Chaîne inversée : " + ChInverse);

        scanner.close();
    }
    public static String inverserChaine(String chaine) {
        StringBuilder sb = new StringBuilder(chaine);
        sb.reverse();
        return sb.toString();
    }
}