import java.util.*;

public class BPartyMonster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int a=sc.nextInt();
            String s = sc.next();
            int op=0;
            int end=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) == '(') op++;
                else end++;
            }
            System.out.println(op == end ? "YES" : "NO");
        }
    }
}