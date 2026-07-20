import java.util.*;

public class AWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t=sc.next();
        int n=t.length();
        int cap=0;
        int smal=0;
        for(int i=0;i<n;i++){
            char c=t.charAt(i);
            if(c >= 'a' && c <= 'z'){
                smal++;
            }else{
                cap++;
            }
        }
        if(cap > smal) System.out.println(t.toUpperCase());
        else System.out.println(t.toLowerCase());
    }
}