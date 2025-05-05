public class exercice1{
    public static void main(String[] args) {
        int n;
        n = methode1.lectureN();
        
        int[] T = new int[n];
        methode1.RemplirTab(T);
        
        int x1 = 5;  
        int x2 = 10;
        methode1.Remplacer(T, x1, x2);
        methode1.AfficheTab(T);
    }
}