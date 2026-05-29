import java.util.*;

public class AAmusingJoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        int[] freq = new int[26];
        for (char ch : a.toCharArray()) freq[ch - 'A']++;
        for (char ch : b.toCharArray()) freq[ch - 'A']++;
        for (char ch : c.toCharArray()) freq[ch - 'A']--;
        for (int x : freq) {
            if (x != 0) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}