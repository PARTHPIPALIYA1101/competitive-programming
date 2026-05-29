import java.util.*;

public class CountingCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int x=sc.nextInt();
            String s=sc.next();
            int a=0,b=0;
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(ch == 'a') a++;
                else b++;
            }
            System.out.println(a+" "+b);
        }
    }
}