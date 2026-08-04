import java.util.*;

public class ALetterHome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int s = sc.nextInt();
            int l = sc.nextInt(), r = l;
            for (int i = 1; i < n; i++) r = sc.nextInt();
            if (s <= l) System.out.println(r - s);
            else if (s >= r) System.out.println(s - l);
            else System.out.println((r - l) + Math.min(s - l, r - s));
        }
    }
}