import java.util.Scanner;

public class Ex2RechRep {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("saisir un texte");
		  String texte = scanner.nextLine();
		 System.out.println("donner le mot1");
		 String mot1 = scanner.nextLine();
		 System.out.println("donner le mot2");
		  String mot2 = scanner.nextLine();
		   if (texte.indexOf(mot1) == -1) {
              System.out.println("mot1 n'est pas dans le texte");
               } else {
            int l = mot1.length(); 
            int p;
             while ((p = texte.indexOf(mot1)) != -1) {
                texte = texte.substring(0, p) + mot2 + texte.substring(p + l);
            }
              System.out.println("Le nouveau texte est : " + texte);
        }

        scanner.close();
    }
}
