import java.util.*;

public class ASpellCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            if (n != 5) {
                System.out.println("NO");
                continue;
            }
            int[] a = new int[128];
            for (char c : s.toCharArray()) {
                a[c]++;
            }
            if (a['T'] == 1 &&
                a['i'] == 1 &&
                a['m'] == 1 &&
                a['u'] == 1 &&
                a['r'] == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}