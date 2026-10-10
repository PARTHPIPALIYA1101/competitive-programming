import java.util.*;

public class AYouReGivenAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length(), ans = 0;
        for (int len = 1; len < n; len++) {
            for (int i = 0; i + len <= n; i++) {
                for (int j = i + 1; j + len <= n; j++) {
                    if (s.substring(i, i + len).equals(s.substring(j, j + len))) {
                        ans = Math.max(ans, len);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}