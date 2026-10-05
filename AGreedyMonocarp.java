import java.util.*;

public class AGreedyMonocarp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt(), k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Arrays.sort(a);
            int sum = 0, ans = k;
            for (int i = n - 1; i >= 0; i--) {
                sum += a[i];
                if (sum <= k) ans = Math.min(ans, k - sum);
                else break;
            }
            System.out.println(ans);
        }
    }
}