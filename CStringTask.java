import java.util.*;

public class CStringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sb=sc.next();
        // sb.toLowerCase();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<sb.length();i++){
            char c=sb.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                c= (char)(c-'A'+'a');
            }
            if(c == 'a' || c == 'o' || c== 'y' || c=='e' || c=='u' || c=='i'){
                continue;
            }
            ans.append("."+c);
        }
        
        System.out.println(ans);
        // for(int i=0;i<ans.size();i++){

        // }
    }
}