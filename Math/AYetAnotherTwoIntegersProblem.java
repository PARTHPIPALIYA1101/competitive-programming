import java.util.*;

public class AYetAnotherTwoIntegersProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=Math.abs(b - a);
            System.out.println((c + 9) / 10);
        }
    }
}