import java.util.*;

public class ACardsForFriends {
    static String sheet(int w, int h, int n) {
        int sheets = 1;
        while (n > sheets) {
            if (w % 2 == 0) {
                sheets *= 2;
                w /= 2;
            } else if (h % 2 == 0) {
                sheets *= 2;
                h /= 2;
            } else {
                return "NO";
            }
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int w = sc.nextInt();
            int h = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(sheet(w, h, n));
        }
    }
}