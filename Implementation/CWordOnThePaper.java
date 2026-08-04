import java.util.*;

public class CWordOnThePaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            String s1 = sc.next();
            String s2 = sc.next();
            String s3 = sc.next();
            String s4 = sc.next();
            String s5 = sc.next();
            String s6 = sc.next();
            String s7 = sc.next();
            String s8 = sc.next();

            StringBuilder sb=new StringBuilder();
            for(int i=0;i<8;i++){
                if(s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z') sb.append(s1.charAt(i));
                if(s2.charAt(i) >= 'a' && s2.charAt(i) <= 'z') sb.append(s2.charAt(i));
                if(s3.charAt(i) >= 'a' && s3.charAt(i) <= 'z') sb.append(s3.charAt(i));
                if(s4.charAt(i) >= 'a' && s4.charAt(i) <= 'z') sb.append(s4.charAt(i));
                if(s5.charAt(i) >= 'a' && s5.charAt(i) <= 'z') sb.append(s5.charAt(i));
                if(s6.charAt(i) >= 'a' && s6.charAt(i) <= 'z') sb.append(s6.charAt(i));
                if(s7.charAt(i) >= 'a' && s7.charAt(i) <= 'z') sb.append(s7.charAt(i));
                if(s8.charAt(i) >= 'a' && s8.charAt(i) <= 'z') sb.append(s8.charAt(i));
            }
            System.out.println(sb);
        }
    }
}