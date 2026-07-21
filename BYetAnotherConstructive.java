import java.util.*;
public class BYetAnotherConstructive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long m = sc.nextLong();
            if (k > m) {
                sb.append("NO\n");
                continue;
            }
            sb.append("YES\n");
            long[] a = new long[n];
            for (int i = 0; i < k - 1; i++)
                a[i] = 1;
            a[k - 1] = m - (k - 1);
            for (int i = k; i < n; i++)
                a[i] = 1;
            for (long x : a)
                sb.append(x).append(' ');
            sb.append('\n');
        }
        System.out.print(sb);
    }
}