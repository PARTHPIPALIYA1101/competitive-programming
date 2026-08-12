import java.util.*;

public class AYouDeleteIDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            String s = sc.next();
            StringBuilder sb = new StringBuilder(s);
            for (int i = 0; i < sb.length(); i++) {
                if (sb.charAt(i) == '0') {
                    sb.deleteCharAt(i);
                    break;
                }
            }
            for (int i = 0; i < sb.length(); i++) {
                if (sb.charAt(i) == '1') {
                    sb.deleteCharAt(i);
                    break;
                }
            }
            System.out.println(sb);
        }
    }
}