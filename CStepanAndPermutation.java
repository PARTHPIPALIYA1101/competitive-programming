import java.util.*;

public class CStepanAndPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int g=gcd(a,b);
            boolean flag=true;
            for (int i = 1; i <= n; i++) {
                int val = sc.nextInt();
                if (val % g != i % g) {
                    flag = false;
                }
            }
            if(flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}