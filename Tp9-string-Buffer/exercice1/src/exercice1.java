import java.util.Scanner;

public class exercice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le texte (max 50 caract�res) : ");
        String texte = scanner.nextLine();

        if (texte.length() > 50) {
            System.out.println("Le texte d�passe 50 caract�res. Veuillez r�essayer.");
            return;
        }

        System.out.print("Entrez le mot � rechercher (max 10 caract�res) : ");
        String mot1 = scanner.next();

        if (mot1.length() > 10) {
            System.out.println("Le mot � rechercher d�passe 10 caract�res. Veuillez r�essayer.");
            return;
        }
        
        System.out.print("Entrez le mot de remplacement (max 10 caract�res) : ");
        String mot2 = scanner.next();

        if (mot2.length() > 10) {
            System.out.println("Le mot de remplacement d�passe 10 caract�res. Veuillez r�essayer.");
            return;
        }

        StringBuffer texteBuffer = new StringBuffer(texte);

        int index = 0;
        while ((index = texteBuffer.indexOf(mot1, index)) != -1) {
            texteBuffer.replace(index, index + mot1.length(), mot2);
            index += mot2.length(); 
        }

        System.out.println("Texte modifi� : " + texteBuffer.toString());

        scanner.close();
    }
}