import java.util.*;

public class ASkibidusAndAmogU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            String s= sc.next();
            if(s.charAt(s.length()-1) == 's' && s.charAt(s.length()-2) =='u'){
                for(int i=0;i<s.length()-2;i++) System.out.print(s.charAt(i));
            }
            System.out.print("i");
            System.out.println();
        }
    }
}