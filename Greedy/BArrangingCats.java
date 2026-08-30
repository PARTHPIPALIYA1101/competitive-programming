import java.util.*;

public class BArrangingCats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            String s = sc.next();
            String f = sc.next();
            int remove = 0, add = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1' && f.charAt(i) == '0') remove++;
                if (s.charAt(i) == '0' && f.charAt(i) == '1') add++;
            }
            System.out.println(Math.max(remove, add));           
        }
    }
}