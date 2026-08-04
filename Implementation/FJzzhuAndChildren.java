import java.util.*;

public class FJzzhuAndChildren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int lc=0;
        int zero=0;
        while(zero < n){
            for(int i=0;i<n;i++){
                if(arr[i]==0) continue;
                if(arr[i] <= k){
                    arr[i]=0;
                    zero++;
                    lc=i+1;
                }else{
                    arr[i]-=k;
                }
            }
        }
        System.out.println(lc);
    }
}