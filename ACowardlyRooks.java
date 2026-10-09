import java.util.*;

public class ACowardlyRooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                sc.nextInt();
                sc.nextInt();
            }
            System.out.println(m < n ? "YES" : "NO");
        }
    }
}