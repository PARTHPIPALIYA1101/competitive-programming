import java.util.*;

public class AFibonacciness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int a4 = sc.nextInt();
            int a5 = sc.nextInt();
            int x = a1 + a2;
            int y = a4 - a2;
            int z = a5 - a4;
            int ans = Math.max(
                    (x == x ? 1 : 0) + (x == y ? 1 : 0) + (x == z ? 1 : 0),
                    Math.max(
                            (y == x ? 1 : 0) + (y == y ? 1 : 0) + (y == z ? 1 : 0),
                            (z == x ? 1 : 0) + (z == y ? 1 : 0) + (z == z ? 1 : 0)
                    )
            );
            System.out.println(ans);
        }
    }
}