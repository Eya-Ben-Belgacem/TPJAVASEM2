import java.util.Scanner;

public class exercice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez une chaîne de caractères (max 20 caractères) : ");
        String ch = scanner.nextLine();

        if (ch.length() > 20) {
            System.out.println("La chaîne dépasse 20 caractères. Veuillez réessayer.");
            return; 
        }

        String chMajuscule = majusculePremiereLettre(ch);

        System.out.println("Chaîne modifiée : " + chMajuscule);

        scanner.close();
    }

    public static String majusculePremiereLettre(String ch) {
        StringBuffer buffer = new StringBuffer(ch);

        if (buffer.length() > 0) {
            buffer.setCharAt(0, Character.toUpperCase(buffer.charAt(0)));
        }

        for (int i = 1; i < buffer.length(); i++) {
            if (buffer.charAt(i - 1) == ' ') {
                buffer.setCharAt(i, Character.toUpperCase(buffer.charAt(i)));
            }
        }

        return buffer.toString();
    }
}