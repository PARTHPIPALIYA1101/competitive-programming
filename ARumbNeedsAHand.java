import java.util.*;

public class ARumbNeedsAHand {
    public static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        Vector<Integer> p = new Vector<>(n);
        Vector<Integer> mismatched = new Vector<>();
        
        for (int i = 0; i < n; ++i) {
            int val = scanner.nextInt();
            p.add(val);
            if (val != i + 1) {
                mismatched.add(i);
            }
        }

        if (mismatched.isEmpty()) {
            System.out.println("YES");
            return;
        }

        int l = mismatched.firstElement();
        int r = mismatched.lastElement();

        boolean possible = true;
        for (int i = 0; i < mismatched.size(); ++i) {
            int idx = mismatched.get(i);
            if (p.get(idx) != r + l - idx + 1) {
                possible = false;
                break;
            }
        }

        if (possible) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            solve(sc);
        }
    }
}