import java.util.Scanner;

public class exercice {  
    public static float convertir(String ch) {
        return Float.parseFloat(ch);  
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donner une chaine :");
        String ch1 = scanner.nextLine();  
        float ch = convertir(ch1);
        System.out.println("Conversion en float : " + ch);
    }
}
