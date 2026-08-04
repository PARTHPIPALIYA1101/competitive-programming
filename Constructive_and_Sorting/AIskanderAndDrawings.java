import java.util.*;

public class AIskanderAndDrawings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            String s=sc.next();
            int c=0;
            int max=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i) == '#') c++;
                else{
                    max=Math.max(max,c);
                    c=0;
                }
            }
            // if(max == 1 || max == 2) System.out.println(1);
            max=Math.max(max,c);
            System.out.println((max+1)/2);
        }
    }
}