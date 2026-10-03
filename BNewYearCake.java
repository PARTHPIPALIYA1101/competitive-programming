import java.util.*;

public class BNewYearCake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(Math.max(calc(a, b), calc(b, a)));
        }
    }
    static int calc(int a, int b) {
        int layers = 0;
        int size = 1;
        while (true) {
            if (layers % 2 == 0) {
                if (a < size) break;
                a -= size;
            } else {
                if (b < size) break;
                b -= size;
            }
            layers++;
            size *= 2;
        }
        return layers;
    }
}