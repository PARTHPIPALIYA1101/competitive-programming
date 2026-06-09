import java.util.*;

public class AC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
             long a = sc.nextLong();
            long b = sc.nextLong();
            long n = sc.nextLong();
            int cnt = 0;
            while (Math.max(a, b) <= n) {
                if (a < b) a += b;
                else b += a;
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}