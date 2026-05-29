import java.util.*;

public class ATrippiTroppi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s=sc.nextLine();
            String[] words = s.split(" "); 
            StringBuilder sb=new StringBuilder();
            for(String c:words) 
                sb.append(c.charAt(0));
            System.out.println(sb);
        }
    }
}