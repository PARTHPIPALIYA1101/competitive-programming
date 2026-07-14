import java.util.*;

public class DYaroslavAndProductivity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int m=sc.nextInt();
            int n=sc.nextInt();
            int arr1[]=new int[m];
            int arr2[]=new int[n];
            for(int i=0;i<m;i++) arr1[i]=sc.nextInt();
            for(int i=0;i<n;i++) arr2[i]=sc.nextInt();
            Arrays.sort(arr2);

            
            long ans = 0;
            int prv = 0;
            for (int i = 0; i < n; i++) {
                long s = 0;
                for (int j = prv; j < arr2[i]; j++) {
                    s += arr1[j];
                }
                ans += Math.abs(s);
                prv = arr2[i];
            }       
            for (int j = prv; j < arr1.length; j++) {
                ans += arr1[j];
            }

            System.out.println(ans);
        }
    }
}