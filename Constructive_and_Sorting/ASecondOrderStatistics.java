import java.util.*;

public class ASecondOrderStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
        if (set.size() < 2) {
            System.out.println("NO");
        } else {
            set.pollFirst();
            System.out.println(set.first());
        }
    }
}