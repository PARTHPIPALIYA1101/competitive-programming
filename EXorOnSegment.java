import java.util.*;

public class EXorOnSegment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] seg = new long[4 * n];
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        build(seg, 0, arr, 0, n - 1);

        int t = sc.nextInt();

        while (t-- > 0) {
            int type = sc.nextInt();

            if (type == 1) {
                int l = sc.nextInt() - 1;
                int r = sc.nextInt() - 1;

                System.out.println(query(seg, 0, 0, n - 1, l, r));
            } else {
                int l = sc.nextInt() - 1;
                int r = sc.nextInt() - 1;
                int x = sc.nextInt();

                for (int i = l; i <= r; i++) {
                    update(seg, 0, 0, n - 1, i, x);
                }
            }
        }

        sc.close();
    }

    public static void build(long[] seg, int idx, int[] arr, int low, int high) {
        if (low == high) {
            seg[idx] = arr[low];
            return;
        }

        int mid = (low + high) >> 1;

        build(seg, idx * 2 + 1, arr, low, mid);
        build(seg, idx * 2 + 2, arr, mid + 1, high);

        seg[idx] = seg[idx * 2 + 1] + seg[idx * 2 + 2];
    }

    public static long query(long[] seg, int idx, int low, int high, int l, int r) {
        if (high < l || low > r) return 0;

        if (low >= l && high <= r) return seg[idx];

        int mid = (low + high) >> 1;

        long lh = query(seg, idx * 2 + 1, low, mid, l, r);
        long rh = query(seg, idx * 2 + 2, mid + 1, high, l, r);

        return lh + rh;
    }

    public static void update(long[] seg, int idx, int low, int high, int pos, int val) {
        if (low == high) {
            seg[idx] ^= val;
            return;
        }

        int mid = (low + high) >> 1;

        if (pos <= mid)
            update(seg, idx * 2 + 1, low, mid, pos, val);
        else
            update(seg, idx * 2 + 2, mid + 1, high, pos, val);
        seg[idx] = seg[idx * 2 + 1] + seg[idx * 2 + 2];
    }
}