import java.util.*;

public class CPoisonedDagger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            long h=sc.nextLong();
            long arr[]=new long[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextLong();
            }
            long l = 1, r = h;
            while(l < r){
                long k = (l + r) / 2;
                long d = k;
                for(int i=1;i<n;i++)d+=Math.min(k,arr[i] - arr[i-1]);
                if(d >= h) r=k;
                else l=k+1;
            }
            System.out.println(l);
        }
    }
}   