import java.util.*;

public class AOnlyOneDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int num = sc.nextInt();
            int max=110;
            while(num > 0){
                int x = num%10;
                num/=10;
                max=Math.min(max,x);
            }
            System.out.println(max);
        }
    }
}