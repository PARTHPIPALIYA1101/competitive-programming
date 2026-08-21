import java.util.*;

public class BAdd0OrK {
    static long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
    static long pow(long a, long e, long mod) {
        long r = 1;
        while (e > 0) {
            if ((e & 1) == 1) r = r * a % mod;
            a = a * a % mod;
            e >>= 1;
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextLong();
            long p = 2;
            while (gcd(p, k) != 1) p++;
            long inv = pow(k % p, p - 2, p);
            for (int i = 0; i < n; i++) {
                long x = ((p - a[i] % p) % p) * inv % p;
                a[i] += x * k;
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}