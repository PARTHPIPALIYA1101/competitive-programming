import java.util.*;

public class ASumOfRoundNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            List<Integer> ls = new ArrayList<>();
            int pow=0;
            while(n > 0){
                int num = (n % 10) * (int)Math.pow(10, pow++);
                n/=10;
                if(num != 0) ls.add(num);
            }
            System.out.println(ls.size());
            for(int i : ls) System.out.print(i+" ");
            System.out.println();
        }
    }
}