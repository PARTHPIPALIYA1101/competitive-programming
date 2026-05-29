import java.util.*;

public class ALegs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int x=sc.nextInt();
            int sum=0;
            sum+=x/4;
            sum+= (x%4) / 2;
            System.out.println(sum);
        }
    }
}