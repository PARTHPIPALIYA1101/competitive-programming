import java.util.*;

public class AStoneGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int min = 0, max = 0;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x == 1) min = i;
                if (x == n) max = i;
            }
            int left = Math.min(min, max);
            int right = Math.max(min, max);
            int ans = Math.min(
                Math.min(right + 1, n - left),
                left + 1 + n - right
            );
            System.out.println(ans);
        }
    }
}