import java.util.*;

public class AFalseAlarm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt(), x = sc.nextInt();
            int first = -1, last = -1;
            for (int i = 0; i < n; i++) {
                if (sc.nextInt() == 1) {
                    if (first == -1) first = i;
                    last = i;
                }
            }
            System.out.println(last - first + 1 <= x ? "YES" : "NO");
        }
    }
}