import java.util.Scanner; 

public class exercice1 { 
    public static void main(String[] args) { 
    	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une cha�ne de caract�res : ");
        String chaine = scanner.nextLine();

        if (!chaine.isEmpty()) { 

            System.out.print("Un caract�re sur deux : ");
            for (int i = 0; i < chaine.length(); i += 2) {
                System.out.print(chaine.charAt(i));
            }
            System.out.println(); 

            char premierCaractere = chaine.charAt(0);
            char dernierCaractere = chaine.charAt(chaine.length() - 1);
            System.out.println("Premier caract�re : " + premierCaractere);
            System.out.println("Dernier caract�re : " + dernierCaractere);
        } else {
            System.out.println("La cha�ne est vide. Veuillez saisir une cha�ne valide.");
        }

        scanner.close(); 
    }
}