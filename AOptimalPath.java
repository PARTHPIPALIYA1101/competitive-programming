import java.util.*;

public class AOptimalPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            long n = sc.nextLong();
            long m = sc.nextLong();
            long rowSum = m * (m + 1) / 2;
            long colSum = 0;
            for (long i = 2; i <= n; i++) {
                colSum += (i - 1) * m + m;
            }
            System.out.println(rowSum + colSum);
        }
    }
}