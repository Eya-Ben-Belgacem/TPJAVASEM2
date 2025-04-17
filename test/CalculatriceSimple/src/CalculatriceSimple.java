import java.util.Scanner;

public class CalculatriceSimple {

    public static double addition(double nombre1, double nombre2) {
        return nombre1 + nombre2;
    }
    
    public static double soustraction(double nombre1, double nombre2) {
        return nombre1 - nombre2;
    }

    public static double multiplication(double nombre1, double nombre2) {
        return nombre1 * nombre2;
    }

    public static double division(double nombre1, double nombre2) {
        return nombre1 / nombre2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String operation;

        System.out.println("Calculatrice Simple");
        System.out.println("------------------");
        
        do {
            System.out.print("Choisissez une opération (+, -, *, /) : ");
            operation = scanner.next(); 
            
            if (!operation.equals("+") && !operation.equals("-") && 
                !operation.equals("*") && !operation.equals("/")) {
                System.out.println("Opération non valide. Veuillez réessayer.");
            }
        } while (!operation.equals("+") && !operation.equals("-") && 
                 !operation.equals("*") && !operation.equals("/"));

        System.out.print("Entrez le premier nombre : ");
        double premierNombre = scanner.nextDouble();
        
        System.out.print("Entrez le deuxième nombre : ");
        double deuxiemeNombre = scanner.nextDouble();
        
        if (operation.equals("/")) {
            while (deuxiemeNombre == 0) {
                System.out.println("Erreur : Division par zéro impossible.");
                System.out.print("Veuillez entrer un deuxième nombre différent de zéro : ");
                deuxiemeNombre = scanner.nextDouble();
            }
        }

        double resultat = 0;
        
        switch (operation) {
            case "+":
                resultat = addition(premierNombre, deuxiemeNombre);
                break;
            case "-":
                resultat = soustraction(premierNombre, deuxiemeNombre);
                break;
            case "*":
                resultat = multiplication(premierNombre, deuxiemeNombre);
                break;
            case "/":
                resultat = division(premierNombre, deuxiemeNombre);
                break;
        }

        System.out.println("Résultat : " + premierNombre + " " + operation + " " + 
                          deuxiemeNombre + " = " + resultat);
        scanner.close();
    }
}