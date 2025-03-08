import java.util.Scanner;

public class exercice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez une cha�ne de caract�res (max 20 caract�res) : ");
        String ch = scanner.nextLine();

        if (ch.length() > 20) {
            System.out.println("La cha�ne d�passe 20 caract�res. Veuillez r�essayer.");
            return; 
        }

        String chMajuscule = majusculePremiereLettre(ch);

        System.out.println("Cha�ne modifi�e : " + chMajuscule);

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