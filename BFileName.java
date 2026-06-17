import java.util.*;

public class BFileName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int ans = 0, cnt = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'x') {
                cnt++;
                if (cnt >= 3) ans++;
            } else {
                cnt = 0;
            }
        }
        System.out.println(ans);
    }
}