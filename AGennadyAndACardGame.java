import java.util.*;

public class AGennadyAndACardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m1 =sc.next();
        boolean flag=false;
        for(int i=0;i<5;i++){
            String s=sc.next();
            if(m1.charAt(0) == s.charAt(0) || m1.charAt(1) == s.charAt(1)) flag=true;
        }
        if(flag) System.out.println("YES");
        else System.out.println("NO");
    }
}