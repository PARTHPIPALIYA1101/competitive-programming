import java.util.*;

public class AEscalatorConversations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int H = sc.nextInt();
            int count = 0;
            for (int i = 0; i < n; i++) {
                int h = sc.nextInt();
                int diff = Math.abs(H - h);
                
                if (diff != 0 && diff % k == 0 && diff / k < m) {
                    count++;
                }
            }
            System.out.println(count);

        }
    }
}