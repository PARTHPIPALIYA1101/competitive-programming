import java.util.*;

public class AAnotherPopcountProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            long ans = 0;
            for (long cost = 1; cost <= n; cost <<= 1) {
                long take = Math.min(k, n / cost);
                ans += take;
                n -= take * cost;
                if (take < k) break;
            }
            System.out.println(ans);
        }
    }
}