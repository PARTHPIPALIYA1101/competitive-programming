import java.util.*;

public class AWeNeedTheZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int xor = 0;
            for (int i = 0; i < n; i++) {
                xor ^= sc.nextInt();
            }
            if ((n & 1) == 1) System.out.println(xor);
            else System.out.println(xor == 0 ? 0 : -1);
        }
    }
}