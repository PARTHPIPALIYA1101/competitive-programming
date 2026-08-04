import java.util.*;

public class AStonesOnTheTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        String s = sc.next();
        int ctn=0;
        for(int i=1;i<t;i++){
            if(s.charAt(i-1) == s.charAt(i)) ctn++;
        }
        System.out.println(ctn);
    }
}