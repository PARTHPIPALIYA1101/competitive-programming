import java.util.*;

public class BBlockTowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            long f = sc.nextLong();
            ArrayList<Long> d = new ArrayList<>();
            for (int i = 1; i < n; i++) {
                long x = sc.nextLong();
                if (x > f) d.add(x);
            }
            Collections.sort(d);
            for (long x : d) {
                if (x >= f)
                    f = (x + f + 1) / 2;
            }
            System.out.println(f);
        }
    }
}