import java.util.Scanner;

public class exercice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le texte (max 50 caractères) : ");
        String texte = scanner.nextLine();

        if (texte.length() > 50) {
            System.out.println("Le texte dépasse 50 caractères. Veuillez réessayer.");
            return;
        }

        System.out.print("Entrez le mot à rechercher (max 10 caractères) : ");
        String mot1 = scanner.next();

        if (mot1.length() > 10) {
            System.out.println("Le mot à rechercher dépasse 10 caractères. Veuillez réessayer.");
            return;
        }
        
        System.out.print("Entrez le mot de remplacement (max 10 caractères) : ");
        String mot2 = scanner.next();

        if (mot2.length() > 10) {
            System.out.println("Le mot de remplacement dépasse 10 caractères. Veuillez réessayer.");
            return;
        }

        StringBuffer texteBuffer = new StringBuffer(texte);

        int index = 0;
        while ((index = texteBuffer.indexOf(mot1, index)) != -1) {
            texteBuffer.replace(index, index + mot1.length(), mot2);
            index += mot2.length(); 
        }

        System.out.println("Texte modifié : " + texteBuffer.toString());

        scanner.close();
    }
}