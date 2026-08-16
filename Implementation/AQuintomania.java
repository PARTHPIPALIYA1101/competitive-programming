import java.util.*;

public class AQuintomania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int prev = sc.nextInt();
            boolean ok = true;
            for (int i = 1; i < n; i++) {
                int cur = sc.nextInt();
                int d = Math.abs(cur - prev);
                if (d != 5 && d != 7) ok = false;
                prev = cur;
            }
            System.out.println(ok ? "YES" : "NO");
        }
    }
}