import java.util.*;

public class ARingRoad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> first = new HashSet<>(), second = new HashSet<>();
        long totalCost = 0, current = 0;

        while (n-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            totalCost += c;
            if (first.contains(a) || second.contains(b)) {
                current += c;
                first.add(b);
                second.add(a);
            } else {
                first.add(a);
                second.add(b);
            }
        }

        System.out.println(Math.min(current, totalCost - current));

    }
}