import java.util.*;

public class COddEvenIncrements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            int oddParity = a[0] % 2;
            int evenParity = a[1] % 2;
            boolean ok = true;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    if (a[i] % 2 != oddParity) {
                        ok = false;
                        break;
                    }
                } else {
                    if (a[i] % 2 != evenParity) {
                        ok = false;
                        break;
                    }
                }
            }
            System.out.println(ok ? "YES" : "NO");
        }
    }
}