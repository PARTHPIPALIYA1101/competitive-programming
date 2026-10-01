import java.util.*;

public class AConcatenationOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[][] a = new long[n][2];
            for (int i = 0; i < n; i++) {
                a[i][0] = sc.nextLong();
                a[i][1] = sc.nextLong();
            }
            Arrays.sort(a, (x, y) -> {
                long minX = Math.min(x[0], x[1]);
                long minY = Math.min(y[0], y[1]);
                if (minX != minY)
                    return Long.compare(minX, minY);
                return Long.compare(Math.max(x[0], x[1]), Math.max(y[0], y[1]));
            });
            for (long[] p : a)
                System.out.print(p[0] + " " + p[1] + " ");
            System.out.println();
        }
    }
}