import java.util.*;

public class ComfortableSeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            int min = Integer.MAX_VALUE;
            for (int x : arr) {
                min = Math.min(min, x);
            }
            int cnt = 0;
            for (int x : arr) {
                if (x == min) cnt++;
            }
            if (cnt >= 2) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}