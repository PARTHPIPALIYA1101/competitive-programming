import java.util.*;

public class AArmy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n];
        for (int i = 1; i < n; i++) d[i] = sc.nextInt();
        int a = sc.nextInt(), b = sc.nextInt();
        int ans = 0;
        for (int i = a; i < b; i++) ans += d[i];
        System.out.println(ans);
    }
}