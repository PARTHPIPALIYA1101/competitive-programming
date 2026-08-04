import java.util.*;

public class ADiverseStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            char[] s = sc.next().toCharArray();
            Arrays.sort(s);
            boolean ok = true;
            for (int i = 1; i < s.length; i++) {
                if (s[i] == s[i - 1] || s[i] - s[i - 1] != 1) {
                    ok = false;
                    break;
                }
            }
            System.out.println(ok ? "Yes" : "No");
        }
    }
}