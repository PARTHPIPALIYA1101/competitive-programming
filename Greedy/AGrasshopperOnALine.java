import java.util.*;

public class AGrasshopperOnALine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            if(n%m != 0){
                System.out.println(1);
                System.out.println(n);
                continue;
            }else{
                System.out.println(2);
                System.out.println((n-m+1)+" "+(m-1));
            }
        }
    }
}