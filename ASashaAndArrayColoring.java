import java.util.*;

public class ASashaAndArrayColoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int l = 0, r = n - 1;
            long ans = 0;
            while (l < r) {
                ans += a[r] - a[l];
                l++;
                r--;
            }
            System.out.println(ans);
        }
    }
}