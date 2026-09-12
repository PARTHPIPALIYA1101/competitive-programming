import java.util.*;

public class AClosestPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            long n = sc.nextLong();
            long a = 0, b = 0;
            for (long p = 0; p < n; p++) {
                b = a;
                a = sc.nextLong();
            }
            System.out.println(n == 2 && Math.abs(b - a) > 1 ? "YES" : "NO");
        }
    }
}