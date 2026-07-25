import java.util.*;

public class APassingTheBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            char[] s = sc.next().toCharArray();
            boolean[] vis = new boolean[n];
            int cur = 0;
            vis[cur] = true;
            for (int i = 0; i < n; i++) {
                if (s[cur] == 'R') cur++;
                else cur--;
                vis[cur] = true;
            }
            int ans = 0;
            for (boolean b : vis) {
                if (b) ans++;
            }
            System.out.println(ans);
        }
    }
}