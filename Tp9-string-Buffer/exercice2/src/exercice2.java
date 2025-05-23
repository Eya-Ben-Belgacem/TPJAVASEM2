import java.util.Scanner;

public class exercice2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une cha�ne de caract�res (max 30 caract�res) : ");
        String ch = scanner.nextLine();

        if (ch.length() > 30) {
            System.out.println("La cha�ne d�passe 30 caract�res. Veuillez r�essayer.");
            return; 
        }
        
        String chCodee = coderChaine(ch);

        System.out.println("Cha�ne cod�e : " + chCodee);

        scanner.close();
    }

    public static String coderChaine(String ch) {
        StringBuffer resultat = new StringBuffer();

        for (int i = 0; i < ch.length(); i++) {
            char c = ch.charAt(i);

            if (c >= 'a' && c <= 'z') {
                c = (char) (c + 3);

                if (c > 'z') {
                    c = (char) (c - 26);
                }
            }
            else if (c >= 'A' && c <= 'Z') {
                c = (char) (c + 3);

                if (c > 'Z') {
                    c = (char) (c - 26);
                }
            }

            resultat.append(c);
        }

        return resultat.toString();
    }
}