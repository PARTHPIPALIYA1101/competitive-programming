import java.util.*;

public class ASatisfyingConstraints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-- >0){
            int n = scanner.nextInt();
            long minK = Long.MIN_VALUE;
            long maxK = Long.MAX_VALUE;
            List<Long> notEquals = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                long x = scanner.nextLong();
                if (a == 1) {
                    minK = Math.max(minK, x);
                } else if (a == 2) {
                    maxK = Math.min(maxK, x);
                } else {
                    notEquals.add(x);
                }
            }

            if (minK > maxK) {
                System.out.println(0);
                continue;
            }

            long count = maxK - minK + 1;
            for (long x : notEquals) {
                if (x >= minK && x <= maxK) {
                    count--;
                }
            }

            System.out.println(Math.max(0, count));
        }
    }
}