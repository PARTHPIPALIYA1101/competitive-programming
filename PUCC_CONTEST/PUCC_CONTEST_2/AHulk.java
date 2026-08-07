import java.util.*;
 
public class AHulk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        StringBuilder a=new StringBuilder("I hate ");
        StringBuilder b=new StringBuilder("it ");
        StringBuilder c=new StringBuilder("I love ");
        StringBuilder d=new StringBuilder("that ");
        StringBuilder ans=new StringBuilder();
        if(t==1) System.out.println("I hate it");
        else{
            for(int i=1;i<t;i++){
                if(i%2!=0){
                    ans.append(a);
                    ans.append(d);
                }else{
                    ans.append(c);
                    ans.append(d);
                }
            }
            if(t%2!=0) ans.append("I hate it");
            else ans.append("I love it");
            System.out.println(ans);
        }
    }
}