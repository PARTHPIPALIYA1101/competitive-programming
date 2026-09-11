import java.util.*;

public class APrimaryTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            String s = String.valueOf(n);
            if (s.length() >= 3 && s.startsWith("10") && s.charAt(2) != '0' && Integer.parseInt(s.substring(2)) >= 2)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}