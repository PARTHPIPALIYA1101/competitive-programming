import java.util.*;

public class AWalkingMaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();
            long diag = d - b;
            long nx = a + diag;
            if (d < b || nx < c) {
                System.out.println(-1);
                continue;
            }
            System.out.println(diag + (nx - c));
        }
    }
}