import java.util.*;

public class BinarySmile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            String s1 = sc.next();
            String s2 = sc.next();
            ArrayList<Integer> a = new ArrayList<>();
            ArrayList<Integer> b = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (s1.charAt(i) == '1') a.add(i);
                if (s2.charAt(i) == '1') b.add(i);
            }
            if (a.size() != b.size()) {
                System.out.println(-1);
                continue;
            }
            int ans = 0;
            for (int i = 0; i < a.size(); i++) {
                if (!a.get(i).equals(b.get(i))) ans++;
            }
            System.out.println(ans);
        }
    }
}