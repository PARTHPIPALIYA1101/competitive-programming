import java.util.*;

public class DWorms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        arr[0]=sc.nextInt();
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1] + sc.nextInt();
        }
        int t=sc.nextInt();
        while(t-- > 0){
            int a=sc.nextInt();
            int ans=-1;
            int low=0;
            int high=n-1;
            while(low <= high){
                int mid = low + (high - low)/2;
                if(arr[mid] >= a){
                    ans=mid;
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            System.out.println(ans+1);
        }
    }
}