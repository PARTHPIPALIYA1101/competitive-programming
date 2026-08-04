import java.util.*;

public class AZeroSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int sum = 0;
            for (int i = 0; i < n; i++) sum += sc.nextInt();
            System.out.println(n % 2 == 0 && sum % 4 == 0 ? "YES" : "NO");
        }
    }
}