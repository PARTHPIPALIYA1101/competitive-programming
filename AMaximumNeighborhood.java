import java.util.*;

public class AMaximumNeighborhood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            long n = sc.nextLong();
            if (n == 1) System.out.println(1);
            else if (n == 2) System.out.println(9);
            else if (n < 5) System.out.println(4 * n * n - n - 4);
            else System.out.println(5 * n * n - 5 * n - 5);
        }
    }
}