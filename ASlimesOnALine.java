import java.util.*;

public class ASlimesOnALine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int mn = Integer.MAX_VALUE, mx = Integer.MIN_VALUE;
            while (n-- > 0) {
                int x = sc.nextInt();
                mn = Math.min(mn, x);
                mx = Math.max(mx, x);
            }
            System.out.println((mx - mn + 1) / 2);
        }
    }
}