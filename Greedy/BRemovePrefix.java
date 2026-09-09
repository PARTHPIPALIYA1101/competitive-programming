import java.util.*;

public class BRemovePrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n + 1];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                b[a[i]]++;
            }
            int ans = 0;
            for (int i = 0; i < n; i++) {
                if (b[a[i]] > 1) {
                    b[a[i]]--;
                    ans = i + 1;
                }
            }
            System.out.println(ans);
        }
    }
}