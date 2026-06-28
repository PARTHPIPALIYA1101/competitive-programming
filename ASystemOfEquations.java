import java.util.*;

public class ASystemOfEquations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = 0;
        for (int a = 0; a * a <= n; a++) {
            int b = n - a * a;
            if (b >= 0 && a + b * b == m) ans++;
        }
        System.out.println(ans);
    }
}