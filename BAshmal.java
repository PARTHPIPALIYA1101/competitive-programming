import java.util.*;

public class BAshmal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            String s = "";
            for (int i = 0; i < n; i++) {
                String x = sc.next();
                String a = x + s;
                String b = s + x;
                s = a.compareTo(b) < 0 ? a : b;
            }
            System.out.println(s);
        }
    }
}