
public class app1 {
    
public static void main(String[] args) {
        int[][] M1 = new int[50][50];
        int nl, nc, i, j;
        do {
            System.out.print("Entrer le nombre de lignes: ");
            nl = Clavier.lireInt();
        } while (nl <= 0 || nl > 50);
        System.out.println("La valeur de nl est: " + nl);
        
        do {
            System.out.print("Entrer le nombre de colonnes: ");
            nc = Clavier.lireInt();
        } while (nc <= 0 || nc > 50);
        System.out.println("La valeur de nc est: " + nc);
        for (i = 0; i < nl; i++) {
            for (j = 0; j < nc; j++) {
            	do{
            	   System.out.print("Remplir M1[" + i + "," + j + "]: ");
                M1[i][j] = Clavier.lireInt();	
            	}while( M1[i][j]%2!=0);
                
            }
        }
    }
}

