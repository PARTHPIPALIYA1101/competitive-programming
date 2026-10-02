import java.util.*;

public class BReverseAPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] p = new int[n];
            for (int i = 0; i < n; i++) p[i] = sc.nextInt();
            int l = 0;
            while (l < n && p[l] == n - l) l++;
            if (l < n) {
                int r = l;
                for (int i = l + 1; i < n; i++) {
                    if (p[i] > p[r]) r = i;
                }
                while (l < r) {
                    int temp = p[l];
                    p[l++] = p[r];
                    p[r--] = temp;
                }
            }
            for (int x : p) System.out.print(x + " ");
            System.out.println();
        }
    }
}