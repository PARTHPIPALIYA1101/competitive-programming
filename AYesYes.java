import java.util.*;

public class AYesYes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (sb.length() < 200) sb.append("Yes");
        String str = sb.toString();
        while (t-- > 0) {
            String s = sc.next();
            System.out.println(str.contains(s) ? "YES" : "NO");
        }
    }
}