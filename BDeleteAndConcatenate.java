import java.util.*;

public class BDeleteAndConcatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            long c = sc.nextLong();
            long ans = -n*c;
            long[] a = new long[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextLong();
                ans += a[i];
            }
            for(int i=0;i<n/2;i++) swap(a,i,n-i-1);
            Arrays.sort(a);
            for (int i=0;i<n/2;i++){
                if(a[i] < c) ans +=c-a[i];
            }
            System.out.println(ans);
        }
    }
    public static void swap(long a[],int i,int j){
        long tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}