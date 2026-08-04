import java.util.*;

public class ADestroyingTowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            long totalSum = a[0];
            int minVal = a[0];
            for (int i = 1; i < n; i++) {
                if (a[i] < minVal) {
                    minVal = a[i];
                }
                totalSum += minVal;
            }
            System.out.println(totalSum);
        }
    }
}