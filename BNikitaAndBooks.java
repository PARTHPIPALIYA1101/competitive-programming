import java.util.*;

public class BNikitaAndBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            boolean flag=true;
            long total=0;
            long n=sc.nextInt();
            for(long i=1;i<=n;i++){
                int x=sc.nextInt();
                total+=x;
                long need=((i*(i+1))/2);
                if(total<need){
                    flag=false;
                }
            }
            if(flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}