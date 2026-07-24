import java.util.*;

public class AFlipFlops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            long c = sc.nextLong();
            long k = sc.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextLong();
            Arrays.sort(a);
            for (long x : a) {
                if (x > c) break;
                long add = Math.min(k, c - x);
                k -= add;
                c += x + add;
            }
            System.out.println(c);
        }
    }
}