import java.util.*;

public class ANewWorldNewMeNewArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int p = sc.nextInt();
            int s = Math.abs(k);
            if (s > n * p) System.out.println(-1);
            else System.out.println((s + p - 1) / p);
        }
    }
}