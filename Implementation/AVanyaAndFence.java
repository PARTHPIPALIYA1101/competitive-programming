import java.util.*;

public class AVanyaAndFence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int x=sc.nextInt();
        int sum=0;
        while(t-- >0){
            int b=sc.nextInt();
            if(b <= x) sum++;
            else sum+=2;
        }
        System.out.println(sum);
    }
}