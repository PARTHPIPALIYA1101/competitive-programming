import java.util.*;

public class ATableWithNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt(), h = sc.nextInt(), l = sc.nextInt();
            int a = 0, b = 0;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x <= h && x <= l) a++;
                else if (x <= h || x <= l) b++;
            }
            System.out.println(a >= b ? (a + b) / 2 : a);
        }
    }
}