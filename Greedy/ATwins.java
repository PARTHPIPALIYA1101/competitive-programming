import java.util.*;

public class ATwins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int arr[]=new int[t];
        int total=0;
        for(int i=0;i<t;i++){
            arr[i]=sc.nextInt();
            total+= arr[i];
        }
        Arrays.sort(arr);
        int j=t-1;
        int sum=0;
        for(int i=t-1;i>=0;i--){
            sum+=arr[i];
            total-=arr[i];
            if(sum>total){
                j=i;
                break;
            }
        }
        System.out.println(t-j);
    }
}