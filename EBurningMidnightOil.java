import java.util.*;

public class EBurningMidnightOil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n=sc.nextLong();
        Long k=sc.nextLong();
        long ans=0;
        long i=0;
        long j=n;
        while(i <= j){
            long mid = i + (j - i)/2;
            long temp=mid;
            long sum=0;
            while(temp > 0){
                sum+=temp;
                temp/=k;
            }
            if(sum >= n){
                ans=mid;
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        System.out.println(ans);
    }
}