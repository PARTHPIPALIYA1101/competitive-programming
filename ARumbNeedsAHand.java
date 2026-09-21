import java.util.*;

public class ARumbNeedsAHand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
        int[] p = new int[n];
        ArrayList<Integer> mismatched = new ArrayList<>();
        
        for (int i = 0; i < n; ++i) {
            p[i] = sc.nextInt();
            if (p[i] != i + 1) {
                mismatched.add(i + 1);
            }
        }
        
        if (mismatched.isEmpty()) {
            System.out.println("YES");
        } else {
            boolean ok = true;
            int l = 0, r = mismatched.size() - 1;
            while (l < r) {
                if (p[mismatched.get(l) - 1] != mismatched.get(r) || p[mismatched.get(r) - 1] != mismatched.get(l)) {
                    ok = false;
                    break;
                }
                l++;
                r--;
            }
            if (ok) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        }
    }
}