import java.util.*;

public class EMashaAndTheGarland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int ssize=sc.nextInt();
            int n=sc.nextInt();
            String s=sc.next();
            int prefix[]=new int[ssize+1];
            for(int i=0;i<ssize-1;i++){
                prefix[i+1]=prefix[i] + (s.charAt(i) == s.charAt(i+1) ? 1 : 0);
            }
            while(n-- > 0){
                int i=sc.nextInt();
                int j=sc.nextInt();
                int max=sc.nextInt();
                int ans=prefix[j-1]-prefix[i-1];
                if(ans <= 2*max) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}