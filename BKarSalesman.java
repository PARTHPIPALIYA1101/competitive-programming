import java.util.*;

public class BKarSalesman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            List<Integer> ls = new ArrayList<>();
            for(int i=0;i<n;i++) ls.add(sc.nextInt());
            int ans=0;
            while (ls.get(ls.size() - 1) != 0) {
                Collections.sort(ls);
                int small = ls.get(0);
                if (small == 0) {
                    ls.remove(0);
                    if (ls.isEmpty()) break;
                    continue;
                }
                ans += small;
                int cnt = 0;
                for (int i = ls.size() - 1; i >= 0 && cnt < x - 1; i--) {
                    ls.set(i, ls.get(i) - small);
                    cnt++;
                }

                ls.set(0, 0);
            }
            System.out.println(ans);
        }
    }
}