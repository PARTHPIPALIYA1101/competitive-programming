import java.util.*;

public class AMonocarpSContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int[] a = new int[5];
            a[0] = sc.nextInt();
            a[1] = sc.nextInt();
            a[3] = sc.nextInt();
            a[4] = sc.nextInt();

            int mx = 0;

            for (int i = -100; i <= 100; i++) {
                a[2] = i;
                int cnt = 0;

                if (a[2] == a[1] + a[0]) cnt++;
                if (a[3] == a[2] + a[1]) cnt++;
                if (a[4] == a[3] + a[2]) cnt++;

                mx = Math.max(mx, cnt);
            }

            System.out.println(mx);

        }
    }
}