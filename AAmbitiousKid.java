import java.util.*;

public class AAmbitiousKid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int min=Integer.MAX_VALUE;
        while(t-- >0){
            int x=sc.nextInt();
            min=Math.min(min,Math.abs(x));
        }
        System.out.println(min);
    }
}