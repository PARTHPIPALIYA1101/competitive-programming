import java.util.*;

public class ASieveOfErato67Henes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            boolean ok = false;
            while (n-- > 0) {
                if (sc.nextInt() == 67) ok = true;
            }
            System.out.println(ok ? "YES" : "NO");
        }
    }
}
