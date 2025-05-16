import java.util.Scanner;

public class exercice2 {

    public static void converti(){
					   }
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Entrez un nombre : ");
        double x = scanner.nextDouble();
        String y = Double.toString(x);
        System.out.println("La chaîne est : " + y);
        scanner.close();
    }

    public static void main(String[] args) {
        converti();
    }
}
