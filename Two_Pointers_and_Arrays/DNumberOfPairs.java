import java.util.*;

public class DNumberOfPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            Arrays.sort(arr);
            long ans = 0;
            for (int i = 0; i < n; i++) {
                int left = Math.max(i + 1, LB(arr, l - arr[i]));
                int right = Math.max(i + 1, LB(arr, r - arr[i] + 1));
                ans += right - left;
            }
            System.out.println(ans);
        }
    }
    public static int LB(int[] arr, int target) {
        int low = 0;
        int high = arr.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}