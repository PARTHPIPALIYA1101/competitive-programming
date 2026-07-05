import java.util.*;

public class AServalAndMochaSArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();`
            boolean ok = false;
            for (int i = 0; i < n && !ok; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (gcd(a[i], a[j]) <= 2) {
                        ok = true;
                        break;
                    }
                }
            }
            System.out.println(ok ? "Yes" : "No");
        }
    }
    static int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}