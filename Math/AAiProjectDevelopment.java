import java.util.*;

public class AAiProjectDevelopment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int noAI = ceilDiv(n, x + y);
            int ai;
            int maximOnly = ceilDiv(n, x);
            if (maximOnly <= z) {
                ai = maximOnly;
            } else {
                int rem = n - x * z;
                ai = z + ceilDiv(rem, x + 10 * y);
            }
            System.out.println(Math.min(noAI, ai));
        }
    }
    static int ceilDiv(int a, int b) {
        return (a + b - 1) / b;
    }
}