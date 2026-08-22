import java.util.*;

public class AGameOfDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt(), k = sc.nextInt();
            int[] a = new int[n];
            int[] cnt = new int[k];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                cnt[a[i] % k]++;
            }
            int ans = -1;
            for (int i = 0; i < n; i++) {
                if (cnt[a[i] % k] == 1) {
                    ans = i + 1;
                    break;
                }
            }
            if (ans == -1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                System.out.println(ans);
            }
        }
    }
}