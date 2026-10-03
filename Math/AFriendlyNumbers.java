import java.util.*;

public class AFriendlyNumbers {
    static int sum(int n) {
        int s = 0;
        while (n > 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int x = sc.nextInt(), ans = 0;
            for (int y = x; y < x + 200; y++)
                if (y - sum(y) == x) ans++;
            System.out.println(ans);
        }
    }
}