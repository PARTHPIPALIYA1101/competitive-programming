import java.util.*;

public class BDigitString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            String s = sc.next();
            int n = s.length();
            int c13 = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1' || s.charAt(i) == '3') {
                    c13++;
                }
            }
            int mx = c13;
            int c2 = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '2') {
                    c2++;
                } else if (s.charAt(i) == '1' || s.charAt(i) == '3') {
                    c13--;
                }
                if (c2 + c13 > mx) {
                    mx = c2 + c13;
                }
            }
            System.out.println(n - mx);
        }
    }
}