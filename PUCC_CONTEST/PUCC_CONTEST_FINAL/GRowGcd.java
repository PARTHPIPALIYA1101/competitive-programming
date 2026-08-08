import java.util.*;

public class GRowGcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        long[] a = new long[n], b = new long[m];
        for (int i = 0; i < n; i++) a[i] = sc.nextLong();
        for (int i = 0; i < m; i++) b[i] = sc.nextLong();
        long g = 0;
        for (int i = 1; i < n; i++)
            g = gcd(g, Math.abs(a[i] - a[0]));
        for (long x : b)
            System.out.print(gcd(g, a[0] + x) + " ");
    }

    static long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}