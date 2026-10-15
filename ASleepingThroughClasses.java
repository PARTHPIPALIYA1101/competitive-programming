import java.util.*;

public class ASleepingThroughClasses {
    static void solve(int n, int k, String s) {
        int sleepCount = 0, awakeUntil = -1;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                awakeUntil = Math.max(awakeUntil, i + k);
            } else if (i > awakeUntil) {
                sleepCount++;
            }
        }
        System.out.println(sleepCount);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt(), k = sc.nextInt();
            String s = sc.next();
            solve(n, k, s);
        }
    }
}