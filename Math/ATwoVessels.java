import java.util.*;

public class ATwoVessels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = Math.abs(a - b);
            System.out.println((d + 2 * c - 1) / (2 * c));
        }
    }
}