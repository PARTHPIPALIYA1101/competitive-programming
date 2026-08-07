import java.util.*;

public class DFriendsAndTheRestaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            long[] x = new long[n];
            long[] y = new long[n];
            for (int i = 0; i < n; i++) x[i] = sc.nextLong();
            for (int i = 0; i < n; i++) y[i] = sc.nextLong();
 
            long[] d = new long[n];
            for (int i = 0; i < n; i++) d[i] = y[i] - x[i];
 
            Arrays.sort(d);
 
            int l = 0;
            int r = n - 1;
            int ans = 0;
            while (l < r) {
                if (d[l] + d[r] >= 0) {
                    ans++;
                    l++;
                    r--;
                } else {
                    l++;
                }
            }
 
            System.out.println(ans);
        }
    }
}