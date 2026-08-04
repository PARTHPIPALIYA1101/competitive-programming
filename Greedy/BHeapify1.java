import java.util.*;

public class BHeapify1 {
    static int core(int x){
        while((x & 1) == 0) x >>= 1;
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            boolean ok = true;
            for(int i = 1; i <= n; i++){
                int x = sc.nextInt();
                if(core(i) != core(x)) ok = false;
            }
            System.out.println(ok ? "YES" : "NO");
        }
    }
}