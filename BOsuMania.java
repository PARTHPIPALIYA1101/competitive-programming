import java.util.*;

public class BOsuMania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String[] arr = new String[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.next();
            }

            for (int i = n - 1; i >= 0; i--) {
                for (int j = 0; j < 4; j++) {
                    if (arr[i].charAt(j) == '#') {
                        System.out.print((j + 1) + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}