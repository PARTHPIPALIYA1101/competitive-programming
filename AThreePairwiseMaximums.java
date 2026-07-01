import java.util.*;

public class AThreePairwiseMaximums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long z = sc.nextLong();
            long[] a = {x, y, z};
            Arrays.sort(a);
            if (a[1] != a[2]) {
                System.out.println("NO");
                continue;
            }
            long s = a[0], l = a[2];
            System.out.println("YES");
            if (x == y && y == z) {
                System.out.println(l + " " + l + " " + l);
            } else if (x == s) {
                System.out.println(s + " " + 1 + " " + l);
            } else if (y == s) {
                System.out.println(s + " " + l + " " + 1);
            } else {
                System.out.println(l + " " + s + " " + 1);
            }
        }
    }
}