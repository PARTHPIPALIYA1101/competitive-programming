import java.util.*;

public class AFreeIceCream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t=sc.nextLong();
        long cream=sc.nextLong();
        long remain =0;
        while(t-- >0){
            char c = sc.next().charAt(0);
            long x = sc.nextLong();
            if(c == '+') cream+= x;
            else{
                if(cream >= x) cream-=x;
                else{
                    remain++;
                }
            }
        }
        System.out.println(cream +" "+remain);
    }
}