import java.util.Scanner;

public class app2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une cha�ne de caract�res : ");
        String ch = scanner.nextLine();

        String premierMot = extrairePremierMot(ch);
        System.out.println("Le premier mot de la cha�ne est : \"" + premierMot + "\"");

        scanner.close(); 
    }
    public static String extrairePremierMot(String ch) {
        ch = ch.trim();
        int indiceEspace = ch.indexOf(' ');
        if (indiceEspace == -1) {
            return ch;
        }
        return ch.substring(0, indiceEspace);
    }
}