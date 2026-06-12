import java.util.*;

public class ACipherShifer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            String s = sc.next();
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                ans.append(ch);
                i++;
                while (i < n && s.charAt(i) != ch) i++;
            }
            System.out.println(ans);
        }
    }
}