import java.util.*;

public class AAndThenThereWereK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int p = Integer.highestOneBit(n);
            System.out.println(p - 1);
        }
    }
}