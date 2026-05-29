import java.util.*;

public class BColourblindness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            String s1=sc.next();
            String s2=sc.next();
            boolean flag =true;
            for(int i=0;i<n;i++){
                char a=s1.charAt(i);
                char b=s2.charAt(i);
                if (a == 'G') a = 'B';
                if (b == 'G') b = 'B';
                if (a != b) {
                    flag = false;
                    break;
                }  
            }
            if(flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}