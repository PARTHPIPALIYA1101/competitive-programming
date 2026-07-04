import java.util.*;

public class BLargeAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            long x=sc.nextLong();
            String s=String.valueOf(x);
            int carry=0;
            boolean flag=true;
            for(int i=s.length()-1;i>=1;i--){
                int num=10 + (int)(x%10) - carry;
                carry=1;
                if(num > 18 || num < 10){
                    flag = false;
                    break;
                }
                x/=10;
            }
            if (s.charAt(0) != '1') flag = false;
            if(flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}