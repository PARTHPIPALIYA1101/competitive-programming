import java.util.*;

public class ASublimeSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int x = sc.nextInt(), n = sc.nextInt();
            System.out.println(n % 2 == 0 ? 0 : x);
        }
    }
}