import java.util.*;

public class APhoenixAndBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int a = 1 << n;
            for (int i = 1; i < n / 2; i++) a += 1 << i;
            int b = 0;
            for (int i = n / 2; i < n; i++) b += 1 << i;
            System.out.println(Math.abs(a - b));
        }
    }
}