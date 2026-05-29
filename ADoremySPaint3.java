import java.util.*;

public class ADoremySPaint3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int a =sc.nextInt();
            int b =sc.nextInt();
            boolean flag=true;
            for(int i=0;i<n-2;i++){
                int x=sc.nextInt();
                if(a+b != b+x){
                    flag=false;
                }
                a=b;
                b=x;
            }
            if(flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}