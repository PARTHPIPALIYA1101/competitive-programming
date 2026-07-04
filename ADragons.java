import java.util.*;

public class ADragons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[][] a = new int[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        Arrays.sort(a, Comparator.comparingInt(x -> x[0]));
        for (int i = 0; i < n; i++) {
            if (s <= a[i][0]) {
                System.out.println("NO");
                return;
            }
            s += a[i][1];
        }
        System.out.println("YES");
    }
}