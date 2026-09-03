import java.util.*;

public class ASocialExperiment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            System.out.println(Math.min(n % 4, 4 - n % 4));
        }
    }
}