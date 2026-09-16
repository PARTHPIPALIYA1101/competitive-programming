import java.util.*;

public class BSymmetricEncoding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-- >0){
            int n = scanner.nextInt();
            String b = scanner.next();

            boolean[] present = new boolean[26];
            for (int i = 0; i < n; i++) {
                present[b.charAt(i) - 'a'] = true;
            }

            StringBuilder r = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (present[i]) {
                    r.append((char) ('a' + i));
                }
            }

            char[] decode = new char[256];
            int m = r.length();
            for (int i = 0; i < m; i++) {
                decode[r.charAt(i)] = r.charAt(m - 1 - i);
            }

            char[] s = new char[n];
            for (int i = 0; i < n; i++) {
                s[i] = decode[b.charAt(i)];
            }

            System.out.println(new String(s));
        }
    }
}