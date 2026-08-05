import java.util.*;

public class AMaximize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int x = sc.nextInt();
            int d = 1;
            for (int i = 2; i * i <= x; i++) {
                if (x % i == 0) {
                    d = x / i;
                    break;
                }
            }
            System.out.println(x - d);
        }
    }
}