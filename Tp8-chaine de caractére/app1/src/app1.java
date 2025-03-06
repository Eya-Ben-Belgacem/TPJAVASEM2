import java.util.Scanner;

public class app1 {
    public static int nbreOccurrences(String str, char target) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une chaîne de caractères : ");
        String ch = scanner.nextLine();

        System.out.print("Entrez un caractère : ");
        char car = scanner.next().charAt(0);
        int occurrences = countOccurrences(ch, car);

        System.out.println("Le nombre d'occurrences de '" + car + "' dans \"" + ch + "\" est : " + occurrences);

        scanner.close(); 
    }
}