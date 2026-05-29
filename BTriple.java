import java.util.*;

public class BTriple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] freq = new int[n + 1];
            int ans = -1;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                freq[x]++;

                if (freq[x] >= 3) {
                    ans = x;
                }
            }

            System.out.println(ans);
        }
    }
}