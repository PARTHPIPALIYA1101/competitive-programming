import java.util.*;

public class AConvergence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Arrays.sort(a);
            int ans = n;
            int i = 0;
            while (i < n) {
                int j = i;
                while (j + 1 < n && a[j + 1] == a[i]) j++;
                int left = i;
                int right = n - j - 1;
                ans = Math.min(ans, Math.max(left, right));
                i = j + 1;
            }
            System.out.println(ans);
        }
    }
}