import java.util.*;

public class AMinimalSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int min=Math.min(a,b);
            int max=Math.max(a,b);
            int area = Math.max(min+min,max);
            System.out.println(area * area);
        }
    }
}