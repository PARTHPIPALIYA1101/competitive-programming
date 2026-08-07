import java.util.*;
 
public class CDistinctSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
 
            int[] freq = new int[26];
            for (int i = 0; i < n; i++) freq[s.charAt(i) - 'a']++;
 
            int right = 0;
            for (int i = 0; i < 26; i++) if (freq[i] > 0) right++;
 
            boolean[] flag = new boolean[26];
            int left = 0;
            int ans = 0;
 
            for (int i = 0; i < n - 1; i++) {
                int ch = s.charAt(i) - 'a';
 
                if (!flag[ch]) {
                    flag[ch] = true;
                    left++;
                }
 
                freq[ch]--;
                if (freq[ch] == 0) right--;
 
                ans = Math.max(ans, left + right);
            }
 
            System.out.println(ans);
        }
    }
}