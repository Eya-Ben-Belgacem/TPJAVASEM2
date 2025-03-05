import java.util.Scanner;
public class application5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une chaîne de caractères : ");
        String Ch = scanner.nextLine();

        String ChAvecAsterisques = insererAsterisques(Ch);

        System.out.println("Chaîne avec astérisques : " + ChAvecAsterisques);

        scanner.close();
    }

    public static String insererAsterisques(String chaine) {
        StringBuilder ch = new StringBuilder();

        for (int i = 0; i < chaine.length(); i++) {
            ch.append(chaine.charAt(i));
            if (i < chaine.length() - 1) {
                ch.append('*');
            }
        }
        return ch.toString();
    }
}