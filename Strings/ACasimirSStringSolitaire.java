import java.util.*;

public class ACasimirSStringSolitaire {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            String s = sc.next();
            int a = 0, b = 0, c = 0;
            for (char ch : s.toCharArray()) {
                if (ch == 'A') a++;
                else if (ch == 'B') b++;
                else c++;
            }
            System.out.println(b == a + c ? "YES" : "NO");           
        }
    }
}