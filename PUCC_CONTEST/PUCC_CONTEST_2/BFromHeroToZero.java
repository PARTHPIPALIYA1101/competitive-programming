import java.util.*;
public class BFromHeroToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long ctn = 0;
            while (n > 0) {
                if (n < k) {
                    ctn += n;
                    break;
                }
                if (n % k == 0) {
                    n /= k;
                    ctn++;
                } else {
                    ctn += n % k;
                    n -= n % k;
                }
            }
            System.out.println(ctn);
        }
    }
}