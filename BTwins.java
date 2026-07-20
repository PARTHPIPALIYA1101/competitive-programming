import java.util.*;

public class BTwins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int total=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            total+=arr[i];
        }
        int flag=0;
        int s=0;
        Arrays.sort(arr);
        for(int i=n-1;i>=0;i--){
            s+=arr[i];
            flag++;
            if(total-s < s){
                break;
            }
        }
        System.out.println(flag);
    }
}