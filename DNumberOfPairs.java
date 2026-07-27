import java.util.*;

public class DNumberOfPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int l=sc.nextInt();
            int r=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int lb=0;
            for(int i=0;i<n;i++){
                if(chk(arr[i],l,r)){
                    lb=i+1;
                }
            }
            System.out.println(lb);
        }
    }
    public static boolean chk(int ed,int l,int r){
        int st=1;
        int sum=0;
        while(st < ed){
            sum= ed-st;
            st++;
            if(sum >= l && sum <= r) return true;
        }
        return false;
    }
}