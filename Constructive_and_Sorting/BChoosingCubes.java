import java.util.*;

public class BChoosingCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt(), f = sc.nextInt(), k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            int x = a[f - 1], greater = 0, equal = 0;
            for (int v : a) {
                if (v > x) greater++;
                if (v == x) equal++;
            }
            if (greater >= k)
                System.out.println("NO");
            else if (greater + equal <= k)
                System.out.println("YES");
            else
                System.out.println("MAYBE");
        }
    }
}