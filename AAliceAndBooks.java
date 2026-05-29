import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a=sc.nextInt();
            int[] arr=new int[a-1];
            for(int i=0;i<a-1;i++){
                arr[i]=sc.nextInt();
            }
            int last = sc.nextInt();
            int max = Integer.MIN_VALUE;
            for(int x : arr) {
                max = Math.max(max, x);
            }
            Arrays.sort(arr);
            System.out.println(max+last);
        }
    }
}