import java.util.*;

public class ABeautifulAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int max = 0;
            for (int i = 0; i < n; i++) {
                max = Math.max(max, sc.nextInt());
            }
            System.out.println(max);
        }
    }
}