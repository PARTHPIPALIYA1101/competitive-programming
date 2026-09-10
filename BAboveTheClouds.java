import java.util.*;

public class BAboveTheClouds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            String s = sc.next();
            boolean found = false;
            for (int i = 1; i < n - 1; i++) {
                int count = 0;
                for (char c : s.toCharArray())
                    if (c == s.charAt(i)) count++;
                if (count > 1) {
                    found = true;
                    break;
                }
            }
            System.out.println(found ? "YES" : "NO");
        }
    }
}