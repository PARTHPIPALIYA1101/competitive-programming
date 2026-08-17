import java.util.*;

public class BRestoreThePermutationByMerger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            boolean[] seen = new boolean[n + 1];
            for (int i = 0; i < 2 * n; i++) {
                int x = sc.nextInt();
                if (!seen[x]) {
                    seen[x] = true;
                    System.out.print(x + " ");
                }
            }
            System.out.println();           
        }
    }
}