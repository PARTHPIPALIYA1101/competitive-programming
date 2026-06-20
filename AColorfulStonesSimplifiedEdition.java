import java.util.*;

public class AColorfulStonesSimplifiedEdition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int pos = 0;
        for (char c : t.toCharArray()) {
            if (s.charAt(pos) == c) pos++;
        }
        System.out.println(pos + 1);
    }
}