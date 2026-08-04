import java.util.*;

public class BEzraftAndArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            if(n < 1) System.out.println(-1);
            else if(n == 1) System.out.println(1);
            else if(n == 2) System.out.println(-1);
            else if(n == 3) System.out.println(1+ " " +2 +" "+3);
            else{
                long sum=3;
                System.out.print(1+ " " +2 +" "+3+" ");
                for(int i=4;i<=n;i++){
                    System.out.print(sum*2 + " ");
                    sum=sum*2;
                }
                System.out.println();
            }
        }
    }
}