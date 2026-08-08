import java.util.*;

public class BPizzaPizzaPizza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = n + 1;
        if (n == 0) System.out.println("0");
        else System.out.println(k % 2 == 0 ? k / 2 : k);
    }
}