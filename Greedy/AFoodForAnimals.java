import java.util.*;

public class AFoodForAnimals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();
            long need = Math.max(0, x - a) + Math.max(0, y - b);
            System.out.println(need <= c ? "YES" : "NO");
        }
    }
}