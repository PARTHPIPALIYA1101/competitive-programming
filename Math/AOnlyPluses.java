import java.util.*;

public class AOnlyPluses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int arr[]=new int[3];
            for(int i=0;i<3;i++){
                arr[i]=sc.nextInt();
            }
            int k=5;
            while(k-- >0){
                int idx = 0;
                for (int i = 1; i < 3; i++) {
                    if (arr[i] < arr[idx]) {
                        idx = i;
                    }
                }
                arr[idx]++;
            }
            System.out.println(arr[0] * arr[1] * arr[2]);
        }
    }
}