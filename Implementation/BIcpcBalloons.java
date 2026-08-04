import java.util.*;

public class BIcpcBalloons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int sum=0;
            int x=sc.nextInt();
            String s=sc.next();
            int arr[]=new int[27];
            for(int i=0;i<x;i++){
                int j= s.charAt(i)-'A';
                if(arr[j]==0){
                    arr[j]++;
                    sum+=2;
                }else sum++;
            }
            System.out.println(sum);
        }
    }
}