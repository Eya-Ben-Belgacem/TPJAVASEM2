import java.util.Scanner;

public class application4_inverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une cha�ne de caract�res : ");
        String Ch = scanner.nextLine();

        String ChInverse = inverserChaine(Ch);

        System.out.println("Cha�ne invers�e : " + ChInverse);

        scanner.close();
    }
    public static String inverserChaine(String chaine) {
        StringBuilder sb = new StringBuilder(chaine);
        sb.reverse();
        return sb.toString();
    }
}