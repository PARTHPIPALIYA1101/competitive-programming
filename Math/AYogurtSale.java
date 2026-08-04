import java.util.*;

public class AYogurtSale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int price=-1;
            if(a*2 <= b) price = a;
            if(price != -1){
                System.out.println(n* price);
            }
            else if(n%2 != 0){
                System.out.println(((n/2)*b) + a);
            }else{
                System.out.println((n/2)*b);
            }
        }
    }
}