import java.util.*;

public class BSkibidusAndOhio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            String s = sc.next();
            boolean ok = false;
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    ok = true;
                    break;
                }
            }
            System.out.println(ok ? 1 : s.length());
        }
    }
}