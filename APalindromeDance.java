import java.util.*;

public class APalindromeDance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int white=sc.nextInt();
        int black=sc.nextInt();
        int min = Math.min(white , black);
        int arr[]=new int[t];
        for(int i=0;i<t;i++) arr[i]=sc.nextInt();
        int i=0;
        int j=t-1;
        boolean flag = false;
        int sum=0;
        while(i<j){
            if((arr[i] == 1 && arr[j]==0) || (arr[i] == 0 && arr[j]==1)){
                flag=true;
                break;
            }
            else if(arr[i] == 1 && arr[j] == 2) sum+=black;
            else if(arr[i] == 0 && arr[j] == 2) sum+=white;
            else if(arr[i] == 2 && arr[j] == 1) sum+=black;
            else if(arr[i] == 2 && arr[j] == 0) sum+=white;
            else if(arr[i] == 2 && arr[j] == 2) sum+=min + min;
            i++;
            j--;
        }
        if(t % 2 != 0 && arr[(t/2)]==2)sum += min;
        if(flag) System.out.println("-1");
        else System.out.println(sum);
    }
}