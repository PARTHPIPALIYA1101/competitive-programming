import java.util.*;

public class BWhoSOpposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int half = Math.abs(a - b);
            int n = half * 2;
            if (half == 0 || a > n || b > n || c > n) {
                System.out.println(-1);
                continue;
            }
            int d = c + half;
            if (d > n) d -= n;
            System.out.println(d);
        }
    }
}