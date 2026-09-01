import java.util.*;

public class AGiftCarpet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt(), m = sc.nextInt();
            String[] a = new String[n];
            for (int i = 0; i < n; i++) a[i] = sc.next();
            String s = "vika";
            int k = 0;
            for (int c = 0; c < m && k < 4; c++)
                for (int r = 0; r < n; r++)
                    if (a[r].charAt(c) == s.charAt(k)) {
                        k++;
                        break;
                    }
            System.out.println(k == 4 ? "YES" : "NO");
        }
    }
}