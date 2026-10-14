import java.util.*;

public class AMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        String[] a = new String[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.next();
        Set<Integer> st = new HashSet<>();
        for (int i = 0; i < m; i++) {
            char k = '0';
            for (int j = 0; j < n; j++)
                k = (char) Math.max(k, a[j].charAt(i));

            for (int j = 0; j < n; j++)
                if (k == a[j].charAt(i))
                    st.add(j + 1);
        }
        System.out.println(st.size());
    }
}