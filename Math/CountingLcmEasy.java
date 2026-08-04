import java.util.*;

public class CountingLcmEasy {
    static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int ctn=0;
            for(int i=2;i<=n;i++){
                for(int j=2;j<=n;j++){
                    if(lcm(i,j) > n) ctn++;
                }
            }
            System.out.println(ctn);
        }
    }
}