import java.util.*;

public class CVasilijeInCacak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            Long n=sc.nextLong();
            Long x=sc.nextLong();
            Long k=sc.nextLong();
            if(n*x >= k) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}