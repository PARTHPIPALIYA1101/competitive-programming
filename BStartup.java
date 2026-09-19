import java.util.*;

public class BStartup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-- >0){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            HashMap<Integer, Long> brandCost = new HashMap<>();
            for (int i = 0; i < k; i++) {
                int b = scanner.nextInt();
                long c = scanner.nextLong();
                brandCost.put(b, brandCost.getOrDefault(b, 0L) + c);
            }
            ArrayList<Long> costs = new ArrayList<>(brandCost.values());
            Collections.sort(costs, Collections.reverseOrder());
            long totalEarnings = 0;
            int limit = Math.min(n, costs.size());
            for (int i = 0; i < limit; i++) {
                totalEarnings += costs.get(i);
            }
            System.out.println(totalEarnings);
        }
    }
}