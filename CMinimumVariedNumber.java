import java.util.*;
public class CMinimumVariedNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int s=sc.nextInt();
            StringBuilder ans=new StringBuilder();
            for(int i=9;i>=1&&s>0;i--){
                if(s>=i){
                    ans.append(i);
                    s-=i;
                }
            }
            System.out.println(ans.reverse());
        }
    }
}