import java.util.*;

public class BDragons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int st=sc.nextInt();
        int t=sc.nextInt();
        boolean flag=true;
        int arr[][]=new int[t][2];
        for(int i=0;i<t;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        Arrays.sort(arr , (a,b) -> a[0]-b[0]);
        for (int i=0;i<t;i++) {
            if (st>arr[i][0]) st +=arr[i][1];
            else {
                flag = false;
                break;
            }
        }
        if (flag) System.out.println("YES");
        else System.out.println("NO");
    }
}