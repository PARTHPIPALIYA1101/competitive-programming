import java.util.*;

public class AOperationsWithInversions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int maxSoFar = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (a < maxSoFar) {
                    count++;
                } else {
                    maxSoFar = a;
                }
            }
            System.out.println(count);
        }
    }
}