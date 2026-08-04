import java.util.*;

public class ANightAtTheMuseum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char cur = 'a';
        int ans=0;
        for(char c : s.toCharArray()) {
            int diff = Math.abs(c - cur);
            ans += Math.min(diff, 26 - diff);
            cur = c;
        }
        System.out.println(ans);
    }
}