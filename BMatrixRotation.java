import java.util.*;

public class BMatrixRotation {
    static boolean ok(int[][] a) {
        return a[0][0] < a[0][1] && a[0][0] < a[1][0] &&
               a[1][0] < a[1][1] && a[0][1] < a[1][1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int[][] a = {{sc.nextInt(), sc.nextInt()}, {sc.nextInt(), sc.nextInt()}};
            boolean ans = false;
            for (int i = 0; i < 4; i++) {
                if (ok(a)) {
                    ans = true;
                    break;
                }
                int x = a[0][0];
                a[0][0] = a[1][0];
                a[1][0] = a[1][1];
                a[1][1] = a[0][1];
                a[0][1] = x;
            }
            System.out.println(ans ? "YES" : "NO");
        }
    }
}