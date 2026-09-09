import java.util.*;

public class AInsertDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt(), d = sc.nextInt();
            String s = sc.next();
            StringBuilder ans = new StringBuilder();
            boolean added = false;
            for (char c : s.toCharArray()) {
                if (!added && c - '0' < d) {
                    ans.append(d);
                    added = true;
                }
                ans.append(c);
            }
            if (!added) ans.append(d);
            System.out.println(ans);
        }
    }
}