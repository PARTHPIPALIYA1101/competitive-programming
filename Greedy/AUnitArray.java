import java.util.*;

public class AUnitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int neg = 0, pos = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x == -1) neg++;
                else pos++;
            }
            int ans = 0;
            int x = Math.max(0, (neg - pos + 1) / 2);
            ans += x;
            neg -= x;
            if (neg % 2 == 1) ans++;
            System.out.println(ans);
        }
    }
}