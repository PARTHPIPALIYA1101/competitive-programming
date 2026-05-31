import java.util.*;

public class ABlackSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 1; i <= 4; i++) {
            a[i] = sc.nextInt();
        }
        String s = sc.next();
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += a[c - '0'];
        }
        System.out.println(sum);
    }
}